package bean;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Departamento;
import repositories.RepositoryDepartamentos;

public class BeanDepartamentos {

    RepositoryDepartamentos repo;

    public BeanDepartamentos() {
        this.repo = new RepositoryDepartamentos();
    }

    public String getTablaDepartamentos() throws SQLException {
        ArrayList<Departamento> departamentos = this.repo.getDepartamentos();
        String html = "<table class='table table-bordered'>";
        html += "<thead>";
        html += "<tr><th>Número</th><th>Nombre</th><th>Localidad</th>";
        html += "</thead>";
        html += "<tbody>";
        for (Departamento d : departamentos) {
            html += "<tr>";
            html += "<td>" + d.getNumero() + "</td>";
            html += "<td>" + d.getNombre() + "</td>";
            html += "<td>" + d.getLocalidad() + "</td>";
            html += "</tr>";
        }
        html += "</tbody>";
        html += "</table>";
        return html;
    }

    public String getDetallesDepartamento(int iddepartamento) throws SQLException {
        Departamento departamento = this.repo.buscarDepartamento(iddepartamento);
        String html = "<ul class='list-group'>";
        html += "<li class='list-group-item'>" + departamento.getNumero() + "</li>";
        html += "<li class='list-group-item'>" + departamento.getNombre() + "</li>";
        html += "<li class='list-group-item'>" + departamento.getLocalidad() + "</li>";
        html += "</ul>";
        return html;
    }
}
