package forms;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import models.Departamento;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import repositories.RepositoryDepartamentos;

public class Form08InsertarDepartamento extends org.apache.struts.action.ActionForm {

    RepositoryDepartamentos repo;

    private int numero;
    private String nombre;
    private String localidad;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Form08InsertarDepartamento() {
        super();
        this.repo = new RepositoryDepartamentos();

    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombre() == null || getNombre().equals("")) {
            errors.add("nombre", new ActionMessage("error.nombre.obligatorio"));

        } else if (getLocalidad() == null || getLocalidad().equals("")) {
            errors.add("localidad", new ActionMessage("error.localidad.obligatorio"));
        }
        int numero = this.getNumero();
        try {
            Departamento departamento = this.repo.buscarDepartamento(numero);
            if (departamento != null) {
                errors.add("numero", new ActionMessage("error.departamento.repetido"));
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
        return errors;
    }
}
