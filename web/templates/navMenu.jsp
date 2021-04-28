<%-- 
    Document   : navMenu
    Created on : 8/04/2021, 09:00:23 PM
    Author     : daval
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <nav class="navbar navbar-dark bg-dark"><!--Navbar content -->
        <a class="navbar-brand" style="font-family: fantasy" href="#">AppWebITC</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav"><li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" style="font-family: fantasy" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">ADMINISTRACIÓN</a>
                    <div class="dropdown-menu" style="font-family: fantasy" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/TiendasArtesanales/ciudadInit">Ciudad</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="/TiendasArtesanales/departamentoInit">Departamento</a>
                        <div class="dropdown-divider"></div>   
                        <a class="dropdown-item" href="/TiendasArtesanales/tipoDocumentoIdentidadInit">Tipo de documento de identidad</a>
                        <div class="dropdown-divider"></div> 
                        <a class="dropdown-item" href="/TiendasArtesanales/rolInit">Roles</a>
                        <div class="dropdown-divider"></div> 
                        <a class="dropdown-item" href="/TiendasArtesanales/usuarioClienteInit">Usuario cliente</a>
                        <div class="dropdown-divider"></div> 
                        <a class="dropdown-item" href="#">Otros</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
    <body>
        
    </body>
</html>
