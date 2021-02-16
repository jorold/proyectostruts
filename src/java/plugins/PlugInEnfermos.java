package plugins;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import models.Enfermo;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryEnfermos;

public class PlugInEnfermos implements PlugIn {

    RepositoryEnfermos repo;

    public PlugInEnfermos() throws SQLException {
        this.repo = new RepositoryEnfermos();
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        try {
            ArrayList<Enfermo> enfermos = this.repo.getEnfermos();
            servlet.getServletContext().setAttribute("listaenfermos", enfermos);
        } catch (SQLException ex) {
            System.out.println("Error SQL " + ex);
        }
    }

}
