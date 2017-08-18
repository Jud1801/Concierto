<%-- 
    Document   : AcercaDe
    Created on : 18/08/2017, 01:32:51 AM
    Author     : TOSHIBA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
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
                        <li><a href="Videos.jsp">Videos</a></li>
                        <li><a href="#">Acerca de</a></li>
                        <li><a href="Conciertos.jsp">Conciertos</a></li>
                        <li><a href="InicioSesion.jsp">Iniciar Sesión</a></li>
                    </ul>

                    <ul id="nav-mobile" class="side-nav">
                        <li><a href="Videos.jsp">Videos</a></li>
                        <li><a href="#">Acerca de</a></li>
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
    
      <article class="row">
        <article id=artGif class="col s4">
          <img src="resourse/imagenes/Dan Raynolds.gif"   alt="Vocalista"   id="imgVocalista"   class="responsive-img">
        </article>
        <article id=artGif class="col s8">
          <br>
          <h4>Dan Raynolds</h4>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Veniam perferendis eos distinctio dolore modi vitae quas quia illum culpa consequuntur dolorum, minima rerum sapiente aspernatur nisi voluptas deleniti quam repellendus.
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quasi quos, cum ipsam. Optio dicta officia voluptates et, aliquid nesciunt odit, nemo tempore ea, enim iure animi obcaecati voluptas debitis recusandae.
          </p>
        </article>
      </article>

      <article class="row">
        <article id=artGif class="col s8">
          <br>
          <h4>Wayne Sermon</h4>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Veniam perferendis eos distinctio dolore modi vitae quas quia illum culpa consequuntur dolorum, minima rerum sapiente aspernatur nisi voluptas deleniti quam repellendus.
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quasi quos, cum ipsam. Optio dicta officia voluptates et, aliquid nesciunt odit, nemo tempore ea, enim iure animi obcaecati voluptas debitis recusandae.
          </p>
        </article>
        <article id=artGif class="col s4">
          <img src="resourse/imagenes/Wayne Sermon.gif"   alt="Guitarrista" id="imgGuitarrista" class="responsive-img">
        </article>
      </article>

      <article class="row">
        <article id=artGif class="col s4">
          <img src="resourse/imagenes/Ben Mckee.gif"      alt="Bajista"     id="imgBajista"     class="responsive-img">
        </article>
        <article id=artGif class="col s8">
          <br>
          <h4>Ben Mckee</h4>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Veniam perferendis eos distinctio dolore modi vitae quas quia illum culpa consequuntur dolorum, minima rerum sapiente aspernatur nisi voluptas deleniti quam repellendus.
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quasi quos, cum ipsam. Optio dicta officia voluptates et, aliquid nesciunt odit, nemo tempore ea, enim iure animi obcaecati voluptas debitis recusandae.
          </p>
        </article>
      </article>

      <article class="row">
        <article id=artGif class="col s8">
          <br>
          <h4>Daniel Platzman</h4>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Veniam perferendis eos distinctio dolore modi vitae quas quia illum culpa consequuntur dolorum, minima rerum sapiente aspernatur nisi voluptas deleniti quam repellendus.
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quasi quos, cum ipsam. Optio dicta officia voluptates et, aliquid nesciunt odit, nemo tempore ea, enim iure animi obcaecati voluptas debitis recusandae.
          </p>
        </article>
        <article id=artGif class="col s4">
         <img src="resourse/imagenes/Daniel Platzman.gif" alt="Baterista"  id="imgBaterista"   class="responsive-img">
        </article>
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
