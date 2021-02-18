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
        <h1>Empleados Oficios Combo</h1>
        <html:form action="/Action18EmpleadosOficiosCombo">
            <label>Seleccione un oficio: </label>
            <html:select property="oficio">
                <logic:iterate name="LISTOFICIOS" id="ofi">
                    <html:option value="${ofi}">
                        <bean:write name="ofi"/>
                    </html:option>
                </logic:iterate>
            </html:select>
            <button type="submit">
                Mostrar empleados
            </button>
        </html:form>
        <logic:present name="EMPLEADOS">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>APELLIDO</th>
                        <th>OFICIO</th>
                        <th>SALARIO</th>
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="EMPLEADOS" id="emp">
                        <tr>
                            <td>
                                <bean:write name="emp" property="apellido"/>
                            </td>
                            <td>1
                                <bean:write name="emp" property="oficio"/>
                            </td>
                            <td>
                                <bean:write name="emp" property="salario"/>
                            </td>
                        </tr>
                    </logic:iterate>
                </tbody>
            </table>
        </logic:present>
    </body>
</html>
