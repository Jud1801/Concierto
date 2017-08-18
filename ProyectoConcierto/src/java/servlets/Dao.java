package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dao extends HttpServlet {
    
     Connection conexion = null; //Objeto para la conexión a la BD
     
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/concierto";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
     
    protected void conectar(){

        try{
            //Leemos el driver de Oracle
            Class.forName(DB_DRIVER);

            //Nos conectamos a la BD
            conexion = DriverManager.getConnection(DB_CONNECTION, DB_USER,
                                                            DB_PASSWORD);

        }catch (ClassNotFoundException e1) {
            //Error si no puedo leer el driver MySQL 
            System.out.println("ERROR:No encuentro el driver de la BD: "+
            e1.getMessage());
        }catch (SQLException e2) {
            //Error SQL: login/password mal
            System.out.println("ERROR:Fallo en SQL: "+e2.getMessage());
        }
    }
    
    protected void desconectar(){
        try {
            if (conexion!=null)
            conexion.close();
        } catch (SQLException e3) {
            System.out.println("ERROR:Fallo al desconectar de la BD: "+
            e3.getMessage());
        }
    }
    
    protected boolean isUser(String user, String pass){
        
        conectar();
        
        Statement sentencia = null; //Objeto para la ejecutar una sentencia
        ResultSet resultados = null;//Objeto para guardar los resultados
        boolean isUser = false;
        
        try {
            //Creamos las sentencias a partir de la conexión
            sentencia = conexion.createStatement();

            String consulta= String.format("SELECT email, contraseña from usuarios where email='%s' and contraseña='%s' ", user, pass);
            //Select a la tabla
            resultados = sentencia.executeQuery(consulta);

            if (resultados.next()) {
                isUser = true;
            }
            
        }catch (SQLException e2) {
            System.out.println("ERROR:Fallo en SQL: "+e2.getMessage());
        } finally{
            desconectar();
        }
        
        return isUser;
        
    }
    
    protected boolean newUser(String name, String genero, String fecha, String email, int num, String custId, String member){
        
        conectar();
        
        Statement sentencia = null; //Objeto para la ejecutar una sentencia
        int resultados = 0;//Objeto para guardar los resultados
        boolean newUser = false;
        
        try {
            //Creamos las sentencias a partir de la conexión
            sentencia = conexion.createStatement();

            String consulta= String.format("INSERT INTO MEMBRESIA VALUES "
                    + "(default, '%s', '%s', '%s', '%s', '%d', '%s', '%s')", name, genero, fecha, email, num, custId, member);
            //Select a la tabla
            sentencia.executeUpdate(consulta);

            if (resultados > 0) {
                newUser = true;
            }
            
        }catch (SQLException e2) {
            System.out.println("ERROR:Fallo en SQL: "+e2.getMessage());
        } finally{
            desconectar();
        }
        
        return newUser;
        
    }
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
