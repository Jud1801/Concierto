package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Concierto</title>\n");
      out.write("        \n");
      out.write("        <!-- CSS  -->\n");
      out.write("        <link href=\"resourse/css/materialize.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"resourse/css/materialize.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"resourse/css/style.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <nav class=\"blue-grey darken-4\" role=\"navigation\">\n");
      out.write("                <div class=\"nav-wrapper container\">\n");
      out.write("                    <a id=\"logo-container\" href=\"#\" class=\"brand-logo\">\n");
      out.write("                        <img src=\"resourse/imagenes/logo.jpg\" alt=\"Concierto\" id=\"logo\" class=\"responsive-img\">\n");
      out.write("                    </a> \n");
      out.write("                    <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                        <li><a href=\"Videos.jsp\">Videos</a></li>\n");
      out.write("                        <li><a href=\"AcercaDe.jsp\">Acerca de</a></li>\n");
      out.write("                        <li><a href=\"Conciertos.jsp\">Conciertos</a></li>\n");
      out.write("                        <li><a href=\"InicioSesion.jsp\">Iniciar Sesión</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul id=\"nav-mobile\" class=\"side-nav\">\n");
      out.write("                        <li><a href=\"Videos.jsp\">Videos</a></li>\n");
      out.write("                        <li><a href=\"AcercaDe.jsp\">Acerca de</a></li>\n");
      out.write("                        <li><a href=\"Conciertos.jsp\">Conciertos</a></li>\n");
      out.write("                        <li><a href=\"InicioSesion.jsp\">Iniciar Sesión</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"#\" data-activates=\"nav-mobile\" class=\"button-collapse\"><i class=\"material-icons\">Menú</i></a>\n");
      out.write("                </div>    \n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section id=\"index-banner\" class=\"parallax-container\">\n");
      out.write("            <div class=\"parallax\"><img src=\"resourse/imagenes/background1.gif\" alt=\"Background1\"></div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <section class=\"container\">\n");
      out.write("            <article class=\"section\">\n");
      out.write("                <h1 class=\"center blue-grey-text\">Imagine Dragons</h1>\n");
      out.write("            </article>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- SECCIÓN CON GIF! -->\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <article id=artGif class=\"section  center-align\">\n");
      out.write("                <img src=\"resourse/imagenes/Daniel Platzman.gif\" alt=\"Baterista\"  id=\"imgBaterista\"   class=\"responsive-img\">\n");
      out.write("            </article>\n");
      out.write("\n");
      out.write("            <article id=artGif class=\"section  center-align\">\n");
      out.write("                <img src=\"resourse/imagenes/Ben Mckee.gif\"      alt=\"Bajista\"     id=\"imgBajista\"     class=\"responsive-img\">\n");
      out.write("                <img src=\"resourse/imagenes/Dan Raynolds.gif\"   alt=\"Vocalista\"   id=\"imgVocalista\"   class=\"responsive-img\">\n");
      out.write("                <img src=\"resourse/imagenes/Wayne Sermon.gif\"   alt=\"Guitarrista\" id=\"imgGuitarrista\" class=\"responsive-img\">\n");
      out.write("            </article>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <section id=\"index-banner\" class=\"parallax-container\">\n");
      out.write("            <div class=\"parallax\"><img src=\"resourse/imagenes/background2.gif\" alt=\"Background2\"></div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- FOOTER -->\n");
      out.write("        <footer class=\"page-footer  blue-grey darken-3\">\n");
      out.write("            <article class=\"footer-copyright\">\n");
      out.write("                <span class=\"container right-align\">\n");
      out.write("                    Todos los derechos reservados\n");
      out.write("                </span>\n");
      out.write("            </article>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("          <!--  Scripts-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script src=\"resourse/js/materialize.js\"></script>\n");
      out.write("        <script src=\"resourse/js/init.js\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
