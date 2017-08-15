package Concierto;

import java.awt.*;
import javax.swing.*;
public class Integrante {
    
    private String rol;
    private ImageIcon foto;
    private ImageIcon gif;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public Image getGif() {
        return gif.getImage();
    }

    public void setGif(ImageIcon gif) {
        this.gif = gif;
    }
}
