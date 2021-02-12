package controllers;

import bean.BeanEmpleados;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action10MenuOficios extends org.apache.struts.action.Action {

    RepositoryEmpleados repo;
    BeanEmpleados bean;

    public Action10MenuOficios() {
        this.repo = new RepositoryEmpleados();
        this.bean = new BeanEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String oficio = request.getParameter("oficio");
        String html = this.bean.getOficioEmpleado(oficio);
        request.setAttribute("empleadosoficio", html);
        return mapping.findForward("webempleadosoficio");
    }
}
