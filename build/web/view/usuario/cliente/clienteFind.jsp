<%-- 
    Document   : departamentoFind
    Created on : 12/04/2021, 10:47:53 PM
    Author     : daval
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <s:include value="/templates/header.jsp"/>
    <body>
        <s:include value="/templates/navMenu.jsp"/>        
        <s:form action="usuarioClienteFind">
            <br>
            <div>
                <s:a action="usuarioClienteAdd" 
                     cssClass="btn btn-success">
                    Agregar
                </s:a> 
            </div>                
            <br>
            <div class="card">
                <!-- Código propio de la página a crear-->
                <div class="card-header" 
                     style="font-family: fantasy">
                    Datos del cliente               
                </div>
                <div class="form-group">
                    <label for="id">
                        Id
                    </label>
                    <br>
                    <input type="text" 
                           class="form-control" 
                           id="id"                           
                           name="id"
                           required="true">
                </div>                
                <s:fielderror cssClass="alert alert-danger" 
                              fieldName="id"/>                
                <s:submit value="Buscar" 
                          cssClass="btn btn-success"/>                    
                <!--Fin código -->
            </div>
        </s:form>
        <s:include value="/templates/footer.jsp"/>
    </body>
</html> 