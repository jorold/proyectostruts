package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Empleado;
import oracle.jdbc.OracleDriver;

public class RepositoryEmpleados {

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection cn = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public ArrayList<Empleado> getEmpleados() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> lista = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int sal = rs.getInt("SALARIO");
            int dept = rs.getInt("DEPT_NO");
            Empleado emp = new Empleado(id, ape, ofi, sal, dept);
            lista.add(emp);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public ArrayList<Empleado> getOficioEmpleado(String oficio) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from emp where upper(oficio)=upper(?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, oficio);
        ResultSet rs = pst.executeQuery();
        ArrayList<Empleado> lista = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int sal = rs.getInt("SALARIO");
            int dept = rs.getInt("DEPT_NO");
            Empleado emp = new Empleado(id, ape, ofi, sal, dept);
            lista.add(emp);
        }
        rs.close();
        cn.close();
        return lista;
    }
}
