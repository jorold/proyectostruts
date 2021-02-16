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
        <h1>Empleados</h1>
        <ul class="list-group">
        <logic:iterate name="listaempleados" id="emp">
            <li class="list-group-item">
                <bean:write name="emp" property="apellido"/>
                <html:link action="/Action14DetallesEmpleado" paramName="emp" 
                           paramProperty="idempleado"
                           paramId="idempleado">Detalles</html:link>
            </li>            
        </logic:iterate>
        </ul>
    </body>
</html>
