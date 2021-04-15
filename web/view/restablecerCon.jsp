<%@page contentType="text/html" pageEncoding="UTF-8"%>
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


        h2 {
            margin-top: 80px;
            margin-bottom: 40px;
            text-align: center;
        }
        p{
            margin-left: 13px;
        }
    </style>
    <s:include value="/templates/header.jsp"/>
    <body>
    <s:include value="/templates/navMenu.jsp"/>
    <div class="login">
        <h2>Restablecer contrase&ntilde;a</h2>
        <p>Le enviaremos un enlace para restablecer la contrase&ntilde;a al siguiente email:</p>
        <input type="text" placeholder="Email" required="required" />
        <button  class="btn">Restablecer</button>
    </div>
    <s:include value="/templates/footer.jsp"/>
</body>
</html>
