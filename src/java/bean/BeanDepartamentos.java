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
        String html = "<table border='1'>";
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
}
