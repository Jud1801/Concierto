package javaweb;

public class Television {
    
    String pantalla;
    int pulgadas;
    String resolucion;
    String marca;
    boolean smartTV;
    
    protected boolean setPantalla(String pantalla){
        if(!pantalla.isEmpty()){
            this.pantalla = pantalla;
            return true;
        }else
            return false;
    }
    
    protected boolean setPulgadas(int pulgadas){
        if(pulgadas > 20){
            this.pulgadas = pulgadas;
            return true;
        }else
            return false;
    }
    
    protected boolean setResolucion(String resolucion){
        if(!resolucion.isEmpty()){
            this.resolucion = resolucion;
            return true;
        }else
            return false;
    }   
    
    protected boolean setMarca(String marca){
        if(!marca.isEmpty()){
            this.marca = marca;
            return true;
        }else
            return false;
    }

    protected boolean setSmartTV(String smartTV){
        if(smartTV.equals("Si")){
            this.smartTV = true;
            return true;
        }else if(smartTV.equals("No")){
            this.smartTV = false;
            return true;
        }
        return false;
    }
    
    protected String getPantalla(){
        return pantalla;
    }
    
    protected int getPulgadas(){
        return pulgadas;
    }
        
    protected String getResolucion(){
        return resolucion;
    }
            
    protected String getMarca(){
        return marca;
    }
    
    protected boolean getSmartTV(){
        return smartTV;
    }
    
}

class Tele{
    
    public static void main(String[] args){
        show();
    }
    
    public static void show(){
        Television tele = new Television();
        tele.setMarca("LG");
        tele.setPantalla("Plasma");
        tele.setPulgadas(40);
        tele.setResolucion("Full HD(1080p)");
        tele.setSmartTV("No");
        
        String cadena = "Televisión marca "+tele.getMarca();
        cadena += "\nTipo de pantalla: "+tele.getPantalla();
        cadena += "\nPulgadas: "+tele.getPulgadas()+"\"";
        cadena += "\nResolución: "+tele.getResolucion();
        if(tele.getSmartTV())
            cadena += "\nSmart TV";
        
        System.out.println(cadena);
    }
}