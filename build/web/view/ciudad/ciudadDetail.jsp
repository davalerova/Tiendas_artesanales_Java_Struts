<%-- 
    Document   : ciudadDetail
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
                Datos de la ciudad                
            </div>
            <div class="row" style="border: black">                
                <div class="col-sm-2">
                    <label>
                        Id:
                    </label>  
                </div>
                <div class="col-sm-10">
                    <s:property value="ciudad.id"/>
                </div>
                <div class="col-sm-2">
                    <label>
                        Ciudad
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="ciudad.descripcion"/>
                </div> 

                <div class="col-sm-2">
                    <label>
                        Departamento
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="ciudad.departamento.descripcion"/>
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

