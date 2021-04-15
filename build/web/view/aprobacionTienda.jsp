<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        .switchBtn {
            position: relative;
            display: inline-block;
            width: 50px;
            height: 25px;
        }
        .switchBtn input {display:none;}
        .slide {
            position: absolute;
            cursor: pointer;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background-color: #ccc;
            -webkit-transition: .4s;
            transition: .4s;
            padding: 8px;
            color: #fff;
        }
        .slide:before {
            position: absolute;
            content: "";
            height: 20px;
            width: 20px;
            left: 24px;
            bottom: 4px;
            background-color: white;
            -webkit-transition: .4s;
            transition: .4s;
        }
        input:checked + .slide {
            background-color: #8CE196;
            padding-left: 40px;
        }
        input:focus + .slide {
            box-shadow: 0 0 1px #01aeed;
        }
        input:checked + .slide:before {
            -webkit-transform: translateX(26px);
            -ms-transform: translateX(26px);
            transform: translateX(26px);
            left: -20px;
        }
        .slide.round {
            border-radius: 34px;
        }
        .slide.round:before {
            border-radius: 50%;
        }
        body{
            background-color: #F2F3EB;
        }

        .contenedor{
            width: auto;
            height: auto;
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
        input, .doc, th{
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
        h3{
            color: #474544;
            font-size:15px;
            font-weight: 700;
            letter-spacing: 7px;
            text-align: center;
            text-transform: uppercase;
            padding: 30px;
        }
        label{
            color: #474544;
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
        .campoImagen{
            width: 250px;
            height: 250px;
            margin: 0 20px;
            border-radius: 4px;
            color: #050505;
            border: 1px solid rgba(0, 0, 0, 0.3);
            background: rgb(241, 238, 238);
            font-size: 13px;
            color: grey;

        }
        td{
            width: 250px;
            height: 30px;
            margin: 0 20px;
            border-radius: 4px;
            color: #050505;
            border: 1px solid rgba(0, 0, 0, 0.3);
            background: white;
            font-size: 13px;
            color: grey;
        }
        divbtn{
            text-align: center;
        }    
    </style>
    <s:include value="/templates/header.jsp"/>
    <body>
    <s:include value="/templates/navMenu.jsp"/>
    <form>
        <div class="contenedor">
            <h1>&bull; Aprobaci&oacute;n de una tienda&bull; </h1>
            <input type="text" placeholder="Nombre" maxlength="40" >
            <input type="text" placeholder="Eslogan" maxlength="40" >
            <input type="text" placeholder="Horario de atención" maxlength="40" >
            <input type="text" placeholder="Teléfono" maxlength="20" >
            <br />
            <br />
            <img class="campoImagen">
            <hr>
            <div class="principal">
                <div class="hijo1"> 
                    <input type="text" placeholder="Departamento" maxlength="40" >
                    <input type="text" placeholder="Ciudad" maxlength="40" >
                    <br />
                    <br />
                    <input type="text" placeholder="Direcci&oacute;n" maxlength="50" >
                    <input class="transparente" disabled>

                </div>
                <div class="hijo2"> 
                    <textarea class="textprin" disabled></textarea>
                    <textarea class="textprin" placeholder="Detalle de la direcci&oacute;n"></textarea>
                    <br />
                    <input class="transparente" disabled>

                </div>
            </div>
            <hr>
            <h3>Productos</h3>
            <table>
                <tr>
                    <th>Nombre</th>
                    <th>Categoría</th>
                    <th>Cantidad</th>
                    <th>Precio</th>
                    <th>Descripción</th>
                    <th>Imagen</th>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
            <input class="transparente" disabled>
            <hr>
            <label>Tienda aprobada</label>
            <label class="switchBtn">
                <input type="checkbox">
                <div class="slide round"></div>
            </label>
            <br />
            <br />
            <textarea class="textprin" placeholder="Observaciones"></textarea>

            <br />

        </div>
        <div class="divbtn">
            <button type="submit" class="btn">Guardar</button>
        </div>
    </form>
    <s:include value="/templates/footer.jsp"/>
</body>
</html>