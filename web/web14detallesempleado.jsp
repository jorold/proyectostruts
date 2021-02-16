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
        <h1>Detalles empleado</h1>
        <html:link action="/Action14Empleado">Volver a Empleados</html:link>
        <html:link action ="/Action14DetallesEmpleado" 
                   paramId="incrementar" paramName="EMPLEADO" paramProperty="idempleado">Incrementar</html:link>
        <logic:present name="detallesempleado">
            <bean:write name="detallesempleado" filter="false"/>
        </logic:present>
    </body>
</html>
