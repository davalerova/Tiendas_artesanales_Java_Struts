package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class autenticacionUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        body {\n");
      out.write("            background: url(img/fondo.jpg);\n");
      out.write("            background-size: cover;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            margin: 0;\n");
      out.write("            height: 90vh;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login {\n");
      out.write("            background: rgb(255, 255, 255);\n");
      out.write("            width: 300px;\n");
      out.write("            height: 500px;\n");
      out.write("            margin: 70px auto;\n");
      out.write("            border-radius: 0.4em;\n");
      out.write("            border: 2px solid #191919;\n");
      out.write("            position: relative;\n");
      out.write("            opacity: 0.85;\n");
      out.write("            padding: 20px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input {\n");
      out.write("            width: 80%;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            background: rgb(241, 238, 238);\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 13px;\n");
      out.write("            color: #050505;\n");
      out.write("            border: 1px solid rgba(0, 0, 0, 0.3);\n");
      out.write("            border-radius: 4px;\n");
      out.write("            margin-left: 15px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        img {\n");
      out.write("            width: 70px;\n");
      out.write("            height: 70px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            margin-left: 105px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn {\n");
      out.write("            margin-top: 29px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-weight: 600;\n");
      out.write("            font-size: 15px;\n");
      out.write("            color: white;\n");
      out.write("            width: 160px;\n");
      out.write("            height: 40px;\n");
      out.write("            background-color: #2079b0;\n");
      out.write("            border-color: #1c5f88;\n");
      out.write("            border-width: 3px;\n");
      out.write("            border-style: solid;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            margin-left: 65px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:hover {\n");
      out.write("            background-color: #cdd3d6;\n");
      out.write("            border-color: #85929E;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ul,ol {\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav>li {\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav li a {\n");
      out.write("            background-color: #95a1ac;\n");
      out.write("            color: rgb(19, 16, 16);\n");
      out.write("            text-decoration: none;\n");
      out.write("            padding: 10px 12px;\n");
      out.write("            display: block;\n");
      out.write("            border-radius: 6px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav li a:hover {\n");
      out.write("            background-color: #e3e6e9;\n");
      out.write("            border: 1px solid;\n");
      out.write("            border-color: #85929E;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav li ul {\n");
      out.write("            display: none;\n");
      out.write("            position: absolute;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav li:hover>ul {\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav li ul li {\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        .vinculo {\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin-top: 60px;\n");
      out.write("            color: black;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .vinculo:hover {\n");
      out.write("\n");
      out.write("            color: #100;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .registro {\n");
      out.write("\n");
      out.write("            margin-left: 55px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <s:include value=\"/templates/header.jsp\"/>\n");
      out.write("    <body>\n");
      out.write("    <s:include value=\"/templates/navMenu.jsp\"/>\n");
      out.write("    <div class=\"login\">\n");
      out.write("        <img src=\"img/icono.png\">\n");
      out.write("        <input type=\"text\" placeholder=\"Usuario\" required=\"required\" />\n");
      out.write("        <input type=\"password\" placeholder=\"Contrase&ntilde;a\" required=\"required\" />\n");
      out.write("        <button class=\"btn\">Ingresar</button>\n");
      out.write("        <div class=\"vinculo\"><a class=\"vinculo\"\n");
      out.write("                                href=\"https://artesaniasdecolombia.com.co/PortalAC/General/template_index.jsf\">¿Olvide mi\n");
      out.write("                contrase&ntilde;a?</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"registro\">\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <p>¿No tengo cuenta?</p>\n");
      out.write("                <li><a href=\"\">Registrarme</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Como artesano</a></li>\n");
      out.write("                        <li><a href=\"\">Como cliente</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
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
