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
        <title>STRUTS</title>
    </head>
    <body>
        <h1>Empleados Detalle Select</h1>
        <html:form action="/Action17EmpleadosDetalleCombo">
            <label>Seleccione empleado:</label>
            <html:select property="idempleado">
                <logic:iterate name="listempleados" id="emp">
                    <html:option value="${emp.idempleado}">
                       <bean:write name="emp" property="apellido"/> 
                    </html:option>           
                </logic:iterate>  
            </html:select>
            <button type="submit" class="btn-outline-info">Detalles empleado</button>
        </html:form>
        <hr/>
        <logic:present name="empleado">
            <ul class="list-group">
                <li class="list-group-item"><bean:write name="empleado" property="apellido"/></li>
                <li class="list-group-item"><bean:write name="empleado" property="oficio"/></li>
                <li class="list-group-item"><bean:write name="empleado" property="salario"/></li>
            </ul>
        </logic:present>
    </body>
</html>
