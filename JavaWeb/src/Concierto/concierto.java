package Concierto;

import javax.swing.*;
import java.awt.*;

public class concierto extends JFrame{
    
    Banda ImagineD = new Banda();
    
    public concierto(){
        super("Concierto");
        crearInterfaz();
    }
    
    private void crearInterfaz(){
        this.setResizable(false);
        this.setSize(800, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
       
        creaBanda();
        
        this.setVisible(true);
    }
    
    private void creaBanda(){
        
        Integrante Dan = creaIntegrante("Dan Raynolds", "Vocalista");
        Integrante Wayne = creaIntegrante("Wayne Sermon", "Guitarrista");
        Integrante Ben = creaIntegrante("Ben Mckee", "Bajista");
        Integrante Daniel = creaIntegrante("Daniel Platzman", "Baterista");
        
        Integrante [] band = new Integrante[]{Dan,Wayne,Ben,Daniel};
        
        ImagineD.setNombre("ImagineDragons");
        ImagineD.setIntegrantes(band);
        
        this.repaint();
    }
    
    public Integrante creaIntegrante(String nombre, String rol){
        Integrante integrante = new Integrante();
        integrante.setNombre(nombre);
        integrante.setRol(rol);
        ImageIcon gif = new ImageIcon("resource/Imagenes/"+nombre+".gif");
        ImageIcon img = new ImageIcon("resource/Imagenes/"+nombre+".jpg");
        integrante.setGif(gif);
        integrante.setFoto(img);
        
        return integrante;
    }
    
    public void paint( Graphics g )
    {
        //super.paint( g );
        Graphics2D g2D = (Graphics2D) g;
        
        ImageIcon fondo = new ImageIcon("resource/Imagenes/escenario.jpg");
        ImageIcon people = new ImageIcon("resource/Imagenes/people.gif");
        
        g2D.drawImage(fondo.getImage(), 0, 0, 800, 600, this);
        
        g2D.drawImage(ImagineD.getIntegrantes()[1].getGif(), 530, 270, 120, 250, this);
        g2D.drawImage(ImagineD.getIntegrantes()[2].getGif(), 130, 340, 150, 180, this);
        g2D.drawImage(ImagineD.getIntegrantes()[3].getGif(), 330, 290, 180, 200, this);
        g2D.drawImage(ImagineD.getIntegrantes()[0].getGif(), 330, 360, 150, 180, this);
        
        g2D.drawImage(people.getImage(), 0, 470, 800, 240, this);
    }
    
    public static void main(String[] args){
        new concierto();
    }
    
}
