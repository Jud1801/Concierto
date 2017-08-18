<%-- 
    Document   : InicioSesion
    Created on : 18/08/2017, 12:52:09 AM
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
                        <li><a href="Videos.jsp">Videos</a></li>
                        <li><a href="AcercaDe.jsp">Acerca de</a></li>
                        <li><a href="Conciertos.jsp">Conciertos</a></li>
                        <li><a href="#">Iniciar Sesión</a></li>
                    </ul>

                    <ul id="nav-mobile" class="side-nav">
                        <li><a href="Videos.jsp">Videos</a></li>
                        <li><a href="AcercaDe.jsp">Acerca de</a></li>
                        <li><a href="Conciertos.jsp">Conciertos</a></li>
                        <li><a href="#">Iniciar Sesión</a></li>
                    </ul>
                    <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">Menú</i></a>
                </div>    
            </nav>
        </header>
          
          <section class="container">
            <article class="section">
                <div id="inicioSesion" class="row">
                  <div class="col s12 m6 offset-m3">
                    <div class="card blue-grey lighten-5">
                        <div class="card-content blue-grey-text center-align">
                          <span class="card-title">Iniciar Sesión</span>
                              
                          <form name="formLogin" action="login" method="post">

                                  <div class="row">
                                      <div class="input-field">
                                          <input name="inEmail" type="email" class="validate">
                                          <label for="inEmail">Email</label>
                                      </div>
                                  </div>

                                  <div class="row">
                                      <div class="input-field">
                                          <input name="inContrasena" type="password" class="validate">
                                          <label for="inContraseña">Contraseña</label>
                                      </div>
                                  </div>

                                  <input class="btn waves-effect blue-grey darken-1" type="submit" name="action" value="Acceder">
                                  <br><br>
                                  <a class="" href="#">¿Olvidaste tu contraseña?</a>
                              </form>
                          
                        </div>
                        <div class="card-action right-align">
                            <a class="btn waves-effect blue-grey darken-1" href="Registro.jsp">Registrar</a>
                      </div>
                    </div>
                  </div>
                </div>
            </article>
          </section>

        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="resourse/js/materialize.js"></script>
        <script src="resourse/js/init.js"></script>
        
    </body>
</html>