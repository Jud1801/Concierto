
package javaweb;

public class Bike {
    
    public static void main(String[] args){
        show();
    }
    
    public static void show(){
        MountainBike bici = new MountainBike();
        bici.setColor("rojo");
        bici.setVelocidad(26.5);
        
        String cadena = "Bici color "+bici.getColor();
        cadena += ", velocidad de "+bici.getVelocidad()+" km/hr";
        System.out.println(cadena);
    }
}
