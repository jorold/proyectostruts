package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Enfermo;
import oracle.jdbc.OracleDriver;

public class RepositoryEnfermos {

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection cn = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public ArrayList<Enfermo> getEnfermos() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from enfermo";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Enfermo> lista = new ArrayList<>();
        while (rs.next()) {
            int ins = rs.getInt("INSCRIPCION");
            String ape = rs.getString("APELLIDO");
            int nss = rs.getInt("NSS");
            Enfermo enfermos = new Enfermo(ins, ape, nss);
            lista.add(enfermos);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public void eliminarEnfermo(int idnss) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "delete from enfermo where inscripcion=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, idnss);
        pst.executeUpdate();
        cn.close();
    }

    public Enfermo buscarEnfermo(int idnss) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from enfermo where nss=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, idnss);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int ins = rs.getInt("INSCRIPCION");
            String ape = rs.getString("APELLIDO");
            int nss = rs.getInt("NSS");
            Enfermo enfermos = new Enfermo(ins, ape, nss);
            rs.close();
            cn.close();
            return enfermos;
        } else {
            rs.close();
            cn.close();
            return null;
        }
    }
}
