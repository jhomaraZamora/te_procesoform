<%-- 
    Document   : salida
    Created on : 24 may. de 2024, 13:27:07
    Author     : JHOMARA
--%>
<%@page import="com.emergentes.modelo.Registro"%>
<%
    Registro item= (Registro)request.getAttribute("miregi"); 
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos Recibidos</h1>
        <p>Los datos recibidos son:</p>
        <ul>
            <li>Nombre: <%= item.getNombre()%> </li>
            <li>Correo:<%= item.getCorreo()%> </li>
            <li>Telefono:<%= item.getTelefono() %> </li>
        </ul>  
        <a href ="index.jsp">Volver  al inicio</a>
        
    </body>
</html>
