package ConciertoInterfaz;

import javax.sound.sampled.*;
public class Banda {
    
    private String nombre;
    private Integrante [] integrantes;
    private Clip [] canciones;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    public Clip[] getCanciones() {
        return canciones;
    }

    public void setCanciones(Clip[] canciones) {
        this.canciones = canciones;
    }
}
