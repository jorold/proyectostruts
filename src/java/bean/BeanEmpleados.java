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

    public String getOficioEmpleado(String oficio) throws SQLException {
        ArrayList<Empleado> empleados = this.repo.getOficioEmpleado(oficio);
        if (empleados == null) {
            String html = "<h1 style'color:red'>No hay empleados con oficio " + oficio + "</h1>";
            return html;
        } else {
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

    public String getEmpleados() throws SQLException {
        ArrayList<Empleado> empleados = this.repo.getEmpleados();
        String html = "<table class='table table-bordered'>";
        html += "<thead>";
        html += "<tr><th>Empleado no</th><th>Apellido</th><th>Oficio</th>"
                + "<th>Salario</th><th>Departamento</th>";
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

    public String getDetallesEmpleado(int idempleado) throws SQLException {
        Empleado empleado = this.repo.buscarEmpleado(idempleado);
        String html = "";
        html += "<ul class='list-group'>";
        html += "<li class='list-group-item'>" + empleado.getApellido() + "</li>";
        html += "<li class='list-group-item'>" + empleado.getOficio() + "</li>";
        html += "<li class='list-group-item'>" + empleado.getSalario() + "</li>";
        html += "</ul>";
        return html;
    }

}
