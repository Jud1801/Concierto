<%-- 
    Document   : Videos
    Created on : 18/08/2017, 01:32:42 AM
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
                    <a id="logo-container" href="index.jsp" class="brand-logo">
                        <img src="resourse/imagenes/logo.jpg" alt="Concierto" id="logo" class="responsive-img">
                    </a> 
                    <ul class="right hide-on-med-and-down">
                        <li><a href="#">Videos</a></li>
                        <li><a href="AcercaDe.jsp">Acerca de</a></li>
                        <li><a href="Conciertos.jsp">Conciertos</a></li>
                        <li><a href="InicioSesion.jsp">Iniciar Sesión</a></li>
                    </ul>

                    <ul id="nav-mobile" class="side-nav">
                        <li><a href="#">Videos</a></li>
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
            

            <h2 class="center-align">Believer</h2>
            <section class="container">
            <article class="section center-align" id="artVideo">
            <video class="responsive-video" controls  loop preload="auto" poster="resourse/imagenes/beliver.jpg">
            <source src="resourse/videos/beliver.mp4">
            </video>
            </article>
            </section>
            
            
            <h2 class="center-align">Thunder</h2>
            <section class="container">
            <article class="section center-align" id="artVideo">
            <video class="responsive-video" controls  loop preload="auto" poster="resourse/imagenes/Thunder.jpg">
            <source src="resourse/videos/Thunder.mp4">
            </video>
            </article>
            </section>
            
            
            <h2 class="center-align">Radioactive</h2>
            <section class="container">
            <article class="section center-align" id="artVideo">
            <video class="responsive-video" controls  loop preload="auto" poster="resourse/imagenes/Radioactive.jpg">
            <source src="resourse/videos/Radioactive.mp4">
            </video>
            </article>
            </section>
            
            
            <h2 class="center-align">Warriors</h2>
            <section class="container">
            <article class="section center-align" id="artVideo">
            <video class="responsive-video" controls  loop preload="auto" poster="resourse/imagenes/Warriors.jpg">
            <source src="resourse/videos/Warriors.mp4">
            </video>
            </article>
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
