<%-- 
    Document   : productoAdd
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
        <s:form action="productoSave">
            <br>
            <div>                
                <s:a action="returnProducto" cssClass="btn btn-success" >
                    Volver
                </s:a>                
            </div>
            <br>
            <div class="card">
                <!-- Código propio de la página a crear-->
                <div class="card-header" style="font-family: fantasy">
                    Datos del producto                       
                </div>
                <div class="form-group">
                    <label for="id">
                        id
                    </label>
                    <br>
                    <input type="text" 
                           class="form-control" 
                           id="id"                           
                           name="producto.id"
                           required="true"
                           disabled>
                    <br>
                    
                    <br>
                    <label for="nombre">
                        Nombre del producto
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="nombre"                           
                           name="producto.nombre"
                           required="true">
                    <br> 
                    
                    <label for="descripcion">
                        Descripcion del producto
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="descripcion"                           
                           name="producto.descripcion"
                           required="true">
                    <br>       
                  

                    <s:select 
                        headerKey="-1" 
                        list="listaTiendasString" 
                        value="Seleccione una Opcion" 
                        name="tienda"
			label="Tienda">
                    </s:select>
                    
                    <br>
                    <div>
                        <label for="categoria">Categoría</label>
                                <select id="categoria" name="producto.categoria">
                                    <option value="Arte">Arte</option>
                                    <option value="Complementos">Complementos</option>
                                    <option value="Cosmética">Cosmética</option>
                                    <option value="Gastronomía">Gastronomía</option>
                                    <option value="Hogar">Hogar</option>
                                    <option value="Juguetes">Juguetes</option>
                                    <option value="Ropa  y calzado">Ropa  y calzado</option>
                                    <option value="Salud">Salud</option>
                                </select>
                        <label for="categoria">
                    </div>
                    <br>
                    <label for="cantidad">
                        Cantidad
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="cantidad"                           
                           name="producto.cantidad"
                           required="true">
                    <br> 
                    
                    <br>
                    <label for="precio">
                        Precio
                    </label>
                    <input type="text" 
                           class="form-control" 
                           id="precio"                           
                           name="producto.precio"
                           required="true">
                    <br> 
                    
                    <br>
                                        

                </div>                
                <s:submit value="Guardar" cssClass="btn btn-success"/>                 
                <!--Fin código -->
            </div>
        </s:form>
        <s:include value="/templates/footer.jsp"/>
    </body>
</html>

