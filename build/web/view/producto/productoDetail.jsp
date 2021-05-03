<%-- 
    Document   : productoDetail
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
                Datos del producto                
            </div>
            <div class="row" style="border: black">                
                <div class="col-sm-2">
                    <label>
                        Id:
                    </label>  
                </div>
                <div class="col-sm-10">
                    <s:property value="producto.id"/>
                </div>
                <div class="col-sm-2">
                    <label>
                        Nombre de la producto
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="producto.nombre"/>
                </div> 

                <div class="col-sm-2">
                    <label>
                        Descripción del producto
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="producto.descripcion"/>
                </div>   
                
                <div class="col-sm-2">
                    <label>
                        Categoría
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="producto.categoria"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Cantidad
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="producto.cantidad"/>
                </div> 
                
                <div class="col-sm-2">
                    <label>
                        Precio
                    </label> 
                </div>
                <div class="col-sm-10">
                    <s:property value="producto.precio"/>
                </div> 
                
                
                
            </div>
            <div>
                <s:a action="returnProducto" cssClass="btn btn-success">
                    Volver
                </s:a>                
            </div>
            <!--Fin código -->
        </div>        
        <s:include value="/templates/footer.jsp"/>
    </body>
</html>

