<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" 
        rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" 
        crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Selección múltiple oficios</h1>
        <html:form action="/Action20SeleccionMultipleOficios">
            <ul class="list-group">
                <logic:iterate name="LISTOFICIOS" id="ofi">
                    <li class="list-group-item">
                        <html:multibox property="oficios">
                            <bean:write name="ofi"/>                   
                        </html:multibox>
                        <bean:write name="ofi"/>
                    </li>
                </logic:iterate>
            </ul>
            <button type="submit" class="btn btn-outline-info">Mostrar empleados</button>
        </html:form>
            <hr/>
        <logic:present name="LISTEMPLEADOS">
                <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>APELLIDO</th>
                        <th>OFICIO</th>
                        <th>SALARIO</th>
                        <th>DEPARTAMENTO</th>
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="LISTEMPLEADOS" id="emp">
                        <tr>
                            <td><bean:write name="emp" property="apellido"/></td>
                            <td><bean:write name="emp" property="oficio"/></td>
                            <td><bean:write name="emp" property="salario"/></td>
                            <td><bean:write name="emp" property="departamento"/></td>
                        </tr>
                    </logic:iterate>
                </tbody>
            </table>
            </logic:present>
    </body>
</html>
