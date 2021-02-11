package controllers;

import bean.BeanDepartamentos;
import forms.Form08InsertarDepartamento;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class Action08InsertarDepartamento extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;
    BeanDepartamentos bean;

    public Action08InsertarDepartamento() {
        this.repo = new RepositoryDepartamentos();
        this.bean = new BeanDepartamentos();
    }

    @Override
    /*public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("numero").toString();
        String nombre = formulario.get("nombre").toString();
        String localidad = formulario.get("localidad").toString();
        int numero = Integer.parseInt(dato);
        this.repo.insertarDepartamento(numero, nombre, localidad);
        return mapping.findForward("webdepartamentos");
    }*/
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Form08InsertarDepartamento formulario = (Form08InsertarDepartamento) form;
        String nombre = formulario.getNombre();
        String localidad = formulario.getLocalidad();
        int numero = formulario.getNumero();
        this.repo.insertarDepartamento(numero, nombre, localidad);
        ArrayList<Departamento> departamentos = this.repo.getDepartamentos();
        /*String html = "<table border='1'>";
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
        html += "</table>";*/
        String html = this.bean.getTablaDepartamentos();
        request.setAttribute("tabladepartamentos", html);
        return mapping.findForward("webdepartamentos");
    }
}
