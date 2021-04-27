package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registroCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-color: #F2F3EB;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contenedor{\n");
      out.write("            width: 1300px;\n");
      out.write("            height: 750px;\n");
      out.write("            border-color: black;\n");
      out.write("            border: 1px solid;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            border-radius: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        input, .doc{\n");
      out.write("            width: 250px;\n");
      out.write("            height: 30px;\n");
      out.write("            margin: 0 20px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            color: #050505;\n");
      out.write("            border: 1px solid rgba(0, 0, 0, 0.3);\n");
      out.write("            background: rgb(241, 238, 238);\n");
      out.write("            font-size: 13px;\n");
      out.write("            color: grey;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .doc{\n");
      out.write("            width: 256px;\n");
      out.write("            height: 32px;\n");
      out.write("        }\n");
      out.write("        .transparente{\n");
      out.write("            background-color: #F2F3EB;\n");
      out.write("            border-color: #F2F3EB;\n");
      out.write("        }\n");
      out.write("        h1{\n");
      out.write("            color: #474544;\n");
      out.write("            font-size: 28px;\n");
      out.write("            font-weight: 700;\n");
      out.write("            letter-spacing: 7px;\n");
      out.write("            text-align: center;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            padding: 30px;\n");
      out.write("        }\n");
      out.write("        h3{\n");
      out.write("            color: #474544;\n");
      out.write("            font-size:15px;\n");
      out.write("            font-weight: 700;\n");
      out.write("            letter-spacing: 7px;\n");
      out.write("            text-align: center;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            padding: 30px;\n");
      out.write("        }\n");
      out.write("        hr{\n");
      out.write("            margin-top: 50px;\n");
      out.write("            margin-bottom: 50px;\n");
      out.write("        }\n");
      out.write("        .btn{\n");
      out.write("            margin-top: 29px;\n");
      out.write("            text-decoration:none;\n");
      out.write("            font-weight: 600;\n");
      out.write("            font-size: 15px;\n");
      out.write("            color:white;\n");
      out.write("            width: 160px;\n");
      out.write("            height: 40px;\n");
      out.write("            background-color:#2079b0;\n");
      out.write("            border-color: #1c5f88 ;\n");
      out.write("            border-width: 3px;\n");
      out.write("            border-style: solid;\n");
      out.write("            border-radius:20px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .btn:hover{\n");
      out.write("            background-color:#cdd3d6;\n");
      out.write("            border-color: #85929E;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn2{\n");
      out.write("            margin-top: 29px;\n");
      out.write("            text-decoration:none;\n");
      out.write("            font-size: 15px;\n");
      out.write("            color:rgba(22, 21, 21, 0.651);\n");
      out.write("            width: 300px;\n");
      out.write("            height: 27px;\n");
      out.write("            background-color:#CACFD2;\n");
      out.write("            border-style: solid;\n");
      out.write("            border-radius:6px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .btn3{\n");
      out.write("            margin-top: 29px;\n");
      out.write("            text-decoration:none;\n");
      out.write("            font-size: 15px;\n");
      out.write("            color:rgba(22, 21, 21, 0.651);\n");
      out.write("            width: 170px;\n");
      out.write("            height: 27px;\n");
      out.write("            background-color:#CACFD2 ;\n");
      out.write("            border-style: solid;\n");
      out.write("            border-radius:6px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .principal{\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("        .hijo1{\n");
      out.write("            display: inline;\n");
      out.write("            width: 650px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        textarea{\n");
      out.write("            width: 255px;\n");
      out.write("            margin: 0 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background: rgb(241, 238, 238);\n");
      out.write("        }\n");
      out.write("        .textprin{\n");
      out.write("            height: 100px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <s:include value=\"/templates/header.jsp\"/>\n");
      out.write("    <body>\n");
      out.write("    <s:include value=\"/templates/navMenu.jsp\"/>\n");
      out.write("    <div class=\"contenedor\">\n");
      out.write("        <form>\n");
      out.write("            <h1>&bull; Creaci&oacute;n de usuario cliente&bull; </h1>\n");
      out.write("            <input type=\"text\" placeholder=\"Nombres\" maxlength=\"40\" >\n");
      out.write("            <input type=\"text\" placeholder=\"Apellidos\" maxlength=\"40\" >\n");
      out.write("            <select class=\"doc\">\n");
      out.write("                <option value=\"\">Tipo de documento</option>\n");
      out.write("                <option value=\"\">Cedula de Ciudadania</option>\n");
      out.write("                <option value=\"\">Nit</option>\n");
      out.write("                <option value=\"\">Cedula de Extranjeria</option>\n");
      out.write("                <option value=\"\">Pasaporte</option>\n");
      out.write("            </select>\n");
      out.write("            <input type=\"text\" placeholder=\"Numero de documento\" maxlength=\"20\" >\n");
      out.write("            <br />\n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("            <input type=\"text\" placeholder=\"Telefono\" maxlength=\"7\" >\n");
      out.write("            <input type=\"text\" placeholder=\"Celular\" maxlength=\"10\" >\n");
      out.write("            <input type=\"text\" placeholder=\"Correo electronico\" maxlength=\"50\" >\n");
      out.write("            <input class=\"transparente\" disabled>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"principal\">\n");
      out.write("                <div class=\"hijo1\"> \n");
      out.write("                    <select class=\"doc\">\n");
      out.write("                        <option value=\"\">Departamento</option>\n");
      out.write("                        <option value=\"\">Amazonas</option>\n");
      out.write("                        <option value=\"\">Antioquia</option>\n");
      out.write("                        <option value=\"\">Huila</option>\n");
      out.write("                        <option value=\"\">Cauca</option>\n");
      out.write("                    </select>\n");
      out.write("                    <select class=\"doc\">\n");
      out.write("                        <option value=\"\">Ciudad</option>\n");
      out.write("                        <option value=\"\">Bogot&aacute;</option>\n");
      out.write("                        <option value=\"\">Medell&iacute;n</option>\n");
      out.write("                        <option value=\"\">Barranquilla</option>\n");
      out.write("                        <option value=\"\">Manizalez</option>\n");
      out.write("                    </select>\n");
      out.write("                    <br />\n");
      out.write("                    <br />\n");
      out.write("                    <input type=\"text\" placeholder=\"Direcci&oacute;n\" maxlength=\"50\" >\n");
      out.write("\n");
      out.write("                    <input class=\"transparente\" disabled>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"hijo2\"> \n");
      out.write("                    <textarea class=\"textprin\" disabled></textarea>\n");
      out.write("                    <textarea class=\"textprin\" placeholder=\"Detalle de la direcci&oacute;n\"></textarea>\n");
      out.write("                    <br />\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"btn3\">Buscar mi localizaci&oacute;n</button>\n");
      out.write("                    <input class=\"transparente\" disabled>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <input type=\"text\" placeholder=\"Usuario\" maxlength=\"20\" >\n");
      out.write("            <input type=\"password\" placeholder=\"Contrase&ntilde;a\" maxlength=\"20\" >\n");
      out.write("        </form>\n");
      out.write("        <button type=\"submit\" class=\"btn\">Registrarse</button>\n");
      out.write("    </div>\n");
      out.write("    <s:include value=\"/templates/footer.jsp\"/>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
