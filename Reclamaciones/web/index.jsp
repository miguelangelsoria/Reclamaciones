<%-- 
    Document   : index
    Created on : 30/07/2020, 09:12:10 PM
    Author     : CEREBRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesion</title>
    <form action="iniciar" method="post">
        <label>Nombre</label>
        <input type="text" name="usuario" /><br><br>
        <label>Contraseña</label>
        <input type="password" name="pass" /><br><br>
        <input type="submit" value="Iniciar sesion" />
    </form>
    <body>
</html>
