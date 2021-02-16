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
        <h1>Eliminar enfermos</h1>
        <html:form action="/Action16EliminarEnfermo">
            <label>Id NSS</label>
            <html:text property="idnss"/>
            <button type="submit" class="btn btn-outline-danger">Eliminar</button>
        </html:form>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Inscripción</th>
                    <th>Apellido</th>
                    <th>NSS</th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="listaenfermos" id="enfermo">
                 <tr>
                     <td><bean:write name="enfermo" property="inscripcion"/></td>
                     <td><bean:write name="enfermo" property="apellido"/></td>
                     <td><bean:write name="enfermo" property="nss"/></td>
                </tr>   
                </logic:iterate>                
            </tbody>
        </table>
    </body>
</html>
