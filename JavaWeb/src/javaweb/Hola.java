package javaweb;

//MARTES
public class Hola implements Printable{

    @Override
    public void imprimir() {
        System.out.println("Estoy imprimiendo algo...");
    }
    
    public static void main(String[] args){
        Hola saludo = new Hola();
        saludo.imprimir();
    }
    
}
