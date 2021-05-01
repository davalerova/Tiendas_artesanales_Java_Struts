<%-- 
    Document   : tiendaAdd
    Created on : 12/04/2021, 10:51:05 PM
    Author     : daval
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <s:include value="/templates/header.jsp"/>
    <body> 
        <s:include value="/templates/navMenu.jsp"/>
        <s:form action="tiendaSave">
            <br>
            <div>                
                <s:a action="returnTienda" cssClass="btn btn-success" >
                    Volver
                </s:a>                
            </div>
            <br>
            <div class="card">
                <!-- Código propio de la página a crear-->
                <div class="card-header" style="font-family: fantasy">
                    Datos de la tienda                       
                </div>
                <div class="form-group">
                    <label for="id">
                        id
                    </label>
                    <br>
                    <input type="text" 
                           class="form-control" 
                           id="id"                           
                           name="tienda.id"
                           required="true"
                           disabled>
                    <br>
                    <label for="descripcion">
                        Nombre de la tienda
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="descripcion"                           
                           name="tienda.nombre"
                           required="true">
                    <br>       
                  

                    <s:select 
                        headerKey="-1" 
                        list="listaUsuariosString" 
                        value="Seleccione una Opcion" 
                        name="usuario"
			label="Usuario">
                    </s:select>
                    
                    <br>
                    <label for="direccion">
                        Dirección
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="direccion"                           
                           name="tienda.direccion"
                           required="true">
                    <br> 
                    <label for="ubicacion">
                        Ubicación GPS
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="ubicacion"                           
                           name="tienda.ubicacionGps"
                           required="true">
                    <br> 
                    
                    <br>
                    <label for="telefono">
                        Teléfono
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="telefono"                           
                           name="tienda.telefono"
                           required="true">
                    <br> 
                    
                    <br>
                    <label for="horario">
                        Horario
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="horario"                           
                           name="tienda.horarioAtencion"
                           required="true">
                    <br> 
                    

                </div>                
                <s:submit value="Guardar" cssClass="btn btn-success"/>                 
                <!--Fin código -->
            </div>
        </s:form>
        <s:include value="/templates/footer.jsp"/>
    </body>
</html>

