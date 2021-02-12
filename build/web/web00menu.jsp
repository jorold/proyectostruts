<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" 
        integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menú de Struts</h1>
        <ul class="list-group">
            <li class="list-group-item"><html:link href="web02sumarnumeros.jsp">Sumar números</html:link></li>
            <li class="list-group-item"><html:link action="/Action06Departamentos">Departamentos</html:link></li>
            <li class="list-group-item"><html:link href="web09menudepartamentosestatico.jsp">Menú departamentos estático</html:link></li>
            <li class="list-group-item"><html:link action="/Action11MenuOficiosDinamicos">Menú oficios dinámicos</html:link></li>
        </ul>
    </body>
</html>
