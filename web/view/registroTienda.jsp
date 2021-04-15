<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        body{
            background-color: #F2F3EB;
        }
        .contenedor{
            width: 1300px;
            height: 540px;
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
        .btn3{
            margin-top: 29px;
            text-decoration:none;
            font-size: 15px;
            color:rgba(22, 21, 21, 0.651);
            width: 170px;
            height: 27px;
            background-color:#CACFD2 ;
            border-style: solid;
            border-radius:6px;

        }
        .principal{
            display: flex;
        }
        .hijo1{
            display: inline;
            width: 650px;
        }

        textarea{
            width: 255px;
            margin: 0 10px;
            border-radius: 5px;
            background: rgb(241, 238, 238);
        }
        .textprin{
            height: 100px;
        }

    </style>
    <s:include value="/templates/header.jsp"/>
    <body>
        <s:include value="/templates/navMenu.jsp"/>
        <div class="contenedor">
            <form>
                <h1>&bull; Creaci&oacute;n de una tienda&bull; </h1>
                <input type="text" placeholder="Nombre" maxlength="40" >
                <input type="text" placeholder="Eslogan" maxlength="40" >
                <input type="text" placeholder="Horario de atención" maxlength="40" >
                <input type="text" placeholder="Teléfono" maxlength="20" >
                <br />
                <br />
                <button type="submit" class="btn3">Subir logo</button>
                <hr>
                <div class="principal">
                    <div class="hijo1"> 
                        <select class="doc">
                            <option value="">Departamento</option>
                            <option value="">Amazonas</option>
                            <option value="">Antioquia</option>
                            <option value="">Huila</option>
                            <option value="">Cauca</option>
                        </select>
                        <select class="doc">
                            <option value="">Ciudad</option>
                            <option value="">Bogot&aacute;</option>
                            <option value="">Medell&iacute;n</option>
                            <option value="">Barranquilla</option>
                            <option value="">Manizales</option>
                        </select>
                        <br />
                        <br />
                        <input type="text" placeholder="Direcci&oacute;n" maxlength="50" >

                        <input class="transparente" disabled>

                    </div>
                    <div class="hijo2"> 
                        <textarea class="textprin" disabled></textarea>
                        <textarea class="textprin" placeholder="Detalle de la direcci&oacute;n"></textarea>
                        <br />
                        <button type="submit" class="btn3">Buscar mi localizaci&oacute;n</button>
                        <input class="transparente" disabled>

                    </div>
                </div>
            </form>
            <br />
            <button type="submit" class="btn">Crear tienda</button>
        </div>
        <s:include value="/templates/footer.jsp"/>
    </body>
</html>