<%-- 
    Document   : departamentoDetail
    Created on : 12/04/2021, 10:49:51 PM
    Author     : daval
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <s:include value="/templates/header.jsp"/>
    <body>
        <s:include value="/templates/navMenu.jsp"/>        
        <div class="card">
            <!-- Código propio de la página a crear-->
            <div class="card-header" style="font-family: fantasy">
                Datos del cliente                
            </div>
            <div class="row" style="border: black">                
                <div class="col-sm-2">
                    <label>
                        Id:
                    </label>  
                </div>
                <div class="col-sm-10">
                    <s:property value="usuario.id"/>
                </div>
                <div class="col-sm-2">
                    <label>
                        Nombres
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="usuario.nombres"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Apellidos
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="usuario.apellidos"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Tipo documento de identidad
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="usuario.tipoDocumentoIdentidad.descripcion"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Número documento de identidad
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="usuario.numeroDocumentoIdentidad"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Teléfono
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="usuario.telefono"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Celular
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="usuario.celular"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Correo electrónico
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="usuario.email"/>
                </div> 
                
            </div>
            <div>
                <s:a action="returnUsuarioCliente" cssClass="btn btn-success">
                    Volver
                </s:a>                
            </div>
            <!--Fin código -->
        </div>        
        <s:include value="/templates/footer.jsp"/>
    </body>
</html>

