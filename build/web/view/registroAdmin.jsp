<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <style>
        body{
            background-color: #F2F3EB;
        }

        .contenedor{
            width: 1300px;
            height: 600px;
            border-color: black;
            border: 1px solid;
            padding: 20px;
            text-align: center;
            margin: 0 auto;
            border-radius: 20px;
        }

        form {
            padding: 20px;
        }
        input, .doc{
            width: 250px;
            height: 30px;
            margin: 0 20px;
            border-radius: 4px;
            color: #050505;
            border: 1px solid rgba(0, 0, 0, 0.3);
            background: rgb(241, 238, 238);
            font-size: 13px;
            color: grey;

        }
        .doc{
            width: 256px;
            height: 32px;
        }
        .transparente{
            background-color: #F2F3EB;
            border-color: #F2F3EB;
        }
        h1{
            color: #474544;
            font-size: 28px;
            font-weight: 700;
            letter-spacing: 7px;
            text-align: center;
            text-transform: uppercase;
            padding: 30px;
        }
        h3{
            color: #474544;
            font-size:15px;
            font-weight: 700;
            letter-spacing: 7px;
            text-align: center;
            text-transform: uppercase;
            padding: 30px;
        }
        hr{
            margin-top: 50px;
            margin-bottom: 50px;
        }
        .btn{
            margin-top: 29px;
            text-decoration:none;
            font-weight: 600;
            font-size: 15px;
            color:white;
            width: 160px;
            height: 40px;
            background-color:#2079b0;
            border-color: #1c5f88 ;
            border-width: 3px;
            border-style: solid;
            border-radius:20px;

        }
        .btn:hover{
            background-color:#cdd3d6;
            border-color: #85929E;
            color: black;
        }



    </style>
    <s:include value="/templates/header.jsp"/>
    <body>
    <s:include value="/templates/navMenu.jsp"/>
    <div class="contenedor">
        <form>
            <h1>&bull; Creaci&oacute;n de usuario administrador&bull; </h1>
            <input type="text" placeholder="Nombres" maxlength="40" >
            <input type="text" placeholder="Apellidos" maxlength="40" >
            <select class="doc">
                <option value="">Tipo de documento</option>
                <option value="">Cedula de Ciudadania</option>
                <option value="">Nit</option>
                <option value="">Cedula de Extranjeria</option>
                <option value="">Pasaporte</option>
            </select>
            <input type="text" placeholder="Numero de documento" maxlength="20" >
            <br />
            <br />

            <input type="text" placeholder="Telefono" maxlength="7" >
            <input type="text" placeholder="Celular" maxlength="10" >
            <input type="text" placeholder="Correo electronico" maxlength="50" >
            <input class="transparente" disabled>

            <hr>

            <input type="text" placeholder="Usuario" maxlength="20" >
            <input type="password" placeholder="Contrase&ntilde;a" maxlength="20" >
        </form>
        <button type="submit" class="btn">Registrarse</button>
    </div>
    <s:include value="/templates/footer.jsp"/>
</body>
</html>
