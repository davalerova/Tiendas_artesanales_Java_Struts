<%-- 
    Document   : ciudadFind
    Created on : 12/04/2021, 10:47:53 PM
    Author     : daval
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <style>
        body {
            background: url(img/fondo.jpg);
            background-size: cover;
            background-repeat: no-repeat;
            margin: 0;
            height: 90vh;

        }

        .login {
            background: rgb(255, 255, 255);
            width: 300px;
            height: 500px;
            margin: 70px auto;
            border-radius: 0.4em;
            border: 2px solid #191919;
            position: relative;
            opacity: 0.85;
            padding: 20px;

        }

        input {
            width: 80%;
            margin-bottom: 10px;
            background: rgb(241, 238, 238);
            padding: 10px;
            font-size: 13px;
            color: #050505;
            border: 1px solid rgba(0, 0, 0, 0.3);
            border-radius: 4px;
            margin-left: 15px;
            margin-top: 10px;
        }

        img {
            width: 70px;
            height: 70px;
            margin-top: 20px;
            margin-left: 105px;

        }

        .btn {
            margin-top: 29px;
            text-decoration: none;
            font-weight: 600;
            font-size: 15px;
            color: white;
            width: 160px;
            height: 40px;
            background-color: #2079b0;
            border-color: #1c5f88;
            border-width: 3px;
            border-style: solid;
            border-radius: 20px;
            margin-left: 65px;
        }

        .btn:hover {
            background-color: #cdd3d6;
            border-color: #85929E;
            color: black;
        }

        ul,ol {
            list-style: none;
        }

        .nav>li {
            float: left;
        }

        .nav li a {
            background-color: #95a1ac;
            color: rgb(19, 16, 16);
            text-decoration: none;
            padding: 10px 12px;
            display: block;
            border-radius: 6px;

        }

        .nav li a:hover {
            background-color: #e3e6e9;
            border: 1px solid;
            border-color: #85929E;
            color: black;
        }

        .nav li ul {
            display: none;
            position: absolute;
        }

        .nav li:hover>ul {
            display: block;
        }

        .nav li ul li {
            position: relative;
        }



        .vinculo {
            text-decoration: none;
            margin-top: 60px;
            color: black;
            text-align: center;
        }

        .vinculo:hover {

            color: #100;
        }

        .registro {

            margin-left: 55px;
        }
    </style>
    <s:include value="/templates/header.jsp"/>
    <body> 
        
        <s:form action="validarCredenciales">
                         
            <br>
            <div class="login">
                <!-- Código propio de la página a crear-->
                <div class="card-header" 
                     style="font-family: fantasy">
                                 
                </div>
                <div class="form-group">
                    <label for="nickname">
                        Usuario
                    </label>
                    <br>
                    <input type="text" 
                           class="form-control" 
                           id="nickname"                           
                           name="nickname"
                           required="true">
                </div>        
                <div class="form-group">
                    <label for="contrasena">
                        Contraseña
                    </label>
                    <br>
                    <input type="password" 
                           class="form-control" 
                           id="contrasena"                           
                           name="contrasena"
                           required="true">
                </div>             
                <s:submit value="Ingresar" 
                          cssClass="btn btn-success"/>                    
                <!--Fin código -->
            </div>
        </s:form>
            
        
        <s:include value="/templates/footer.jsp"/>
    </body>
</html> 