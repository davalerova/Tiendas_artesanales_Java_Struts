<%-- 
    Document   : clienteAdd
    Created on : 12/04/2021, 10:51:05 PM
    Author     : daval
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
            <html>
            <s:include value="/templates/header.jsp"></s:include>

            <body>
                <s:include value="/templates/navMenu.jsp"></s:include>

                <s:form action="usuarioSave">
                    <br>

                    <div>
                        <s:a
                            action="returnUsuarioCliente"
                            cssClass="btn btn-success"
                        >Volver</s:a>
                    </div>

                    <br>

                    <div class="card">
                        <!-- Código propio de la página a crear -->

                        <div
                            class="card-header"
                            style="font-family: fantasy"
                        >Datos del cliente</div>

                        <div class="form-group">
                            <label for="id">id</label>

                            <br>

                            <input
                                type="text"
                                class="form-control"
                                id="id"
                                disabled="disabled"
                                name="usuario.id"
                                required="true"
                            ></input>

                            <br>

                            <label for="nombres">Nombres del cliente</label>

                            <input
                                type="text"
                                class="form-control"
                                id="nombres"
                                name="usuario.nombres"
                                required="true"
                            ></input>

                            <br>

                            <label for="apellidos">Apellidos del cliente</label>

                            <input
                                type="text"
                                class="form-control"
                                id="apellidos"
                                name="usuario.apellidos"
                                required="true"
                            ></input>

                            <br>

                            <label for="tipoDocumentoIdentidad">Tipo documento de identidad</label>

                            <s:select
                                headerKey="-1"
                                list="listaTiposDocumentoIdentidadString"
                                value="Seleccione una Opcion"
                                name="tipoDocumentoIdentidad"
                            ></s:select>

                            <br>

                            <label for="numeroDocumentoIdentidad">Número documento de identidad</label>

                            <input
                                type="text"
                                class="form-control"
                                id="numeroDocumentoIdentidad"
                                name="usuario.numeroDocumentoIdentidad"
                                required="true"
                            ></input>

                            <br>

                            <label for="telefono">Teléfono</label>

                            <input
                                type="text"
                                class="form-control"
                                id="telefono"
                                name="usuario.telefono"
                                required="true"
                            ></input>

                            <br>

                            <label for="celular">Celular</label>

                            <input
                                type="text"
                                class="form-control"
                                id="celular"
                                name="usuario.celular"
                                required="true"
                            ></input>

                            <br>

                            <label for="email">Correo electrónico</label>

                            <input
                                type="text"
                                class="form-control"
                                id="email"
                                name="usuario.email"
                                required="true"
                            ></input>

                        </div>

                        <s:submit
                            value="Guardar"
                            cssClass="btn btn-success"
                        ></s:submit>

                        <!-- Fin código -->
                    </div>
                </s:form>

                <s:include value="/templates/footer.jsp"></s:include>
            </body>
            </html>
        </%@taglib>
    </%@page>
</%-->