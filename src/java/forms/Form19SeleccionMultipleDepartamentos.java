package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Form19SeleccionMultipleDepartamentos extends org.apache.struts.action.ActionForm {

    //se necesita una propiedad para poder recuperar múltiples departamentos desde la vista
    //que llamamos como la property de multibox <html:multibox property="departamentos">
    private String[] departamentos;

    public String[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String[] departamentos) {
        this.departamentos = departamentos;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }
}
