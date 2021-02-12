package bean;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Empleado;
import repositories.RepositoryEmpleados;

public class BeanEmpleados {

    RepositoryEmpleados repo;

    public BeanEmpleados() {
        this.repo = new RepositoryEmpleados();
    }

    public String getTablaEmpleados() throws SQLException {
        ArrayList<Empleado> empleados = this.repo.getEmpleados();
        String html = "<table border='1'>";
        html += "<thead>";
        html += "<tr><th>Empleado no</th><th>Apellido</th><th>Oficio</th><th>Salario</th><th>Departamento</th>";
        html += "</thead>";
        html += "<tbody>";
        for (Empleado emp : empleados) {
            html += "<tr>";
            html += "<td>" + emp.getIdempleado() + "</td>";
            html += "<td>" + emp.getApellido() + "</td>";
            html += "<td>" + emp.getOficio() + "</td>";
            html += "<td>" + emp.getSalario() + "</td>";
            html += "<td>" + emp.getDepartamento() + "</td>";
            html += "</tr>";
        }
        html += "</tbody>";
        html += "</table>";
        return html;
    }

    public String getOficioEmpleado(String oficio) throws SQLException {
        ArrayList<Empleado> empleados = this.repo.getOficioEmpleado(oficio);
        String html = "<table class='table table-bordered'>";
        html += "<thead>";
        html += "<tr><th>Empleado no</th><th>Apellido</th><th>Oficio</th><th>Salario</th><th>Departamento</th>";
        html += "</thead>";
        html += "<tbody>";
        for (Empleado emp : empleados) {
            html += "<tr>";
            html += "<td>" + emp.getIdempleado() + "</td>";
            html += "<td>" + emp.getApellido() + "</td>";
            html += "<td>" + emp.getOficio() + "</td>";
            html += "<td>" + emp.getSalario() + "</td>";
            html += "<td>" + emp.getDepartamento() + "</td>";
            html += "</tr>";
        }
        html += "</tbody>";
        html += "</table>";
        return html;
    }
}
