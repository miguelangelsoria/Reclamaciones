<%-- 
    Document   : Registros
    Created on : 31/07/2020, 03:10:21 PM
    Author     : CEREBRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarme</title>
    </head>
    <body>
        <h1>Formulario de registro</h1>
        <form action="text" method="post">
            <label>Usuario</label>
            <input type="text" name="usuario" /><br><br>
            <label>Nombre</label>
            <input type="text" name="nombre" /><br><br>
            <label>Apellido</label>
            <input type="text" name="apellido" /><br><br>
            <label>Contraseña</label>
            <input type="text" name="password" /><br><br>
            
            <input type="submit" value="registrar" />
        </form>       
    </body>
</html>
