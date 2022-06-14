<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORMULARIO DE CONTACTO</title>
</head>
<body>
<FORM >
    
    <h1> FORMULARIO DE CONTACTO </h1>
    <p>    
    <LABEL for="nombre">Nombre: </LABEL>
              <INPUT type="text" id="nombre"><BR>
    <LABEL for="apellido">Apellido: </LABEL>
              <INPUT type="text" id="apellido"><BR>
    <LABEL for="email">Email: </LABEL>
              <INPUT type="text" id="email"><BR>
     <LABEL for="consultas">Escriba su Consulta: </LABEL>
              <INPUT type="text" id="consultas"><BR>         
    <INPUT type="radio" name="sexo" value="Hombre"> Hombre <BR>
    <INPUT type="radio" name="sexo" value="Mujer"> Mujer<BR>
    <INPUT type="radio" name="sexo" value="Indefinido"> Prefiero no decir<BR>
    <INPUT type="submit" value="Enviar"> <INPUT type="reset">
    </p>
    
 </FORM>

</body>
</html>