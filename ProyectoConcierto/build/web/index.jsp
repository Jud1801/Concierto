<%-- 
    Document   : index
    Created on : 17/08/2017, 08:22:44 PM
    Author     : TOSHIBA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Concierto</title>
        
        <!-- CSS  -->
        <link href="resourse/css/materialize.min.css" type="text/css" rel="stylesheet"/>
        <link href="resourse/css/materialize.css" type="text/css" rel="stylesheet"/>
        <link href="resourse/css/style.css" type="text/css" rel="stylesheet"/>
    </head>
    
    <body>
        
        <header>
            <nav class="blue-grey darken-4" role="navigation">
                <div class="nav-wrapper container">
                    <a id="logo-container" href="#" class="brand-logo">
                        <img src="resourse/imagenes/logo.jpg" alt="Concierto" id="logo" class="responsive-img">
                    </a> 
                    <ul class="right hide-on-med-and-down">
                        <li><a href="Videos.jsp">Videos</a></li>
                        <li><a href="AcercaDe.jsp">Acerca de</a></li>
                        <li><a href="Conciertos.jsp">Conciertos</a></li>
                        <li><a href="InicioSesion.jsp">Iniciar Sesión</a></li>
                    </ul>

                    <ul id="nav-mobile" class="side-nav">
                        <li><a href="Videos.jsp">Videos</a></li>
                        <li><a href="AcercaDe.jsp">Acerca de</a></li>
                        <li><a href="Conciertos.jsp">Conciertos</a></li>
                        <li><a href="InicioSesion.jsp">Iniciar Sesión</a></li>
                    </ul>
                    <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">Menú</i></a>
                </div>    
            </nav>
        </header>

        <section id="index-banner" class="parallax-container">
            <div class="parallax"><img src="resourse/imagenes/background1.gif" alt="Background1"></div>
        </section>
        
        <section class="container">
            <article class="section">
                <h1 class="center blue-grey-text">Imagine Dragons</h1>
            </article>
        </section>

        <!-- SECCIÓN CON GIF! -->
        <section class="container">
            <article id=artGif class="section  center-align">
                <img src="resourse/imagenes/Daniel Platzman.gif" alt="Baterista"  id="imgBaterista"   class="responsive-img">
            </article>

            <article id=artGif class="section  center-align">
                <img src="resourse/imagenes/Ben Mckee.gif"      alt="Bajista"     id="imgBajista"     class="responsive-img">
                <img src="resourse/imagenes/Dan Raynolds.gif"   alt="Vocalista"   id="imgVocalista"   class="responsive-img">
                <img src="resourse/imagenes/Wayne Sermon.gif"   alt="Guitarrista" id="imgGuitarrista" class="responsive-img">
            </article>
        </section>

        
        <section id="index-banner" class="parallax-container">
            <div class="parallax"><img src="resourse/imagenes/background2.gif" alt="Background2"></div>
        </section>

        <!-- FOOTER -->
        <footer class="page-footer  blue-grey darken-3">
            <article class="footer-copyright">
                <span class="container right-align">
                    Todos los derechos reservados
                </span>
            </article>
        </footer>

          <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="resourse/js/materialize.js"></script>
        <script src="resourse/js/init.js"></script>
        
    </body>
</html>
