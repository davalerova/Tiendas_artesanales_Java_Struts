<%-- 
    Document   : rolAdd
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
        <s:form action="rolSave">
            <br>
            <div>                
                <s:a action="returnRol" cssClass="btn btn-success" >
                    Volver
                </s:a>                
            </div>
            <br>
            <div class="card">
                <!-- Código propio de la página a crear-->
                <div class="card-header" style="font-family: fantasy">
                    Datos del rol                      
                </div>
                <div class="form-group">
                    <label for="id">
                        id
                    </label>
                    <br>
                    <input type="text" 
                           class="form-control" 
                           id="id"         
                           disabled
                           name="rol.id"
                           required="true">
                    <br>
                    <label for="descripcion">
                        Nombre del rol
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="descripcion"                           
                           name="rol.descripcion"
                           required="true">
                </div>                
                <s:submit value="Guardar" cssClass="btn btn-success"/>                 
                <!--Fin código -->
            </div>
        </s:form>
        <s:include value="/templates/footer.jsp"/>
    </body>
</html>

