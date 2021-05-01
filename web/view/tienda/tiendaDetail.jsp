<%-- 
    Document   : tiendaDetail
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
                Datos de la tienda                
            </div>
            <div class="row" style="border: black">                
                <div class="col-sm-2">
                    <label>
                        Id:
                    </label>  
                </div>
                <div class="col-sm-10">
                    <s:property value="tienda.id"/>
                </div>
                <div class="col-sm-2">
                    <label>
                        Nombre de la tienda
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="tienda.nombre"/>
                </div> 

                <div class="col-sm-2">
                    <label>
                        Dirección
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="tienda.direccion"/>
                </div>   
                
                <div class="col-sm-2">
                    <label>
                        Ubicación GPS
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="tienda.ubicacionGps"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Teléfono
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="tienda.telefono"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Horario de atención
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="tienda.horarioAtencion"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Número de documento de identidad del propietario
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="tienda.usuario.numeroDocumentoIdentidad"/>
                </div> 
                
            </div>
            <div>
                <s:a action="returnper" cssClass="btn btn-success">
                    Volver
                </s:a>                
            </div>
            <!--Fin código -->
        </div>        
        <s:include value="/templates/footer.jsp"/>
    </body>
</html>

