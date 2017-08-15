/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb;

/*
    Constructor de una clase
    Es un conjunto de instrucciones diseñado para inicializar una instancia
    de una clase.
    En su declaración o encabezado puede aceptar parametros.

    class Bob {
        Bob(){
            //Bob el constructor
        }
        Bob bob = new Bob(); <- Toma el constructor por default;
    }

    Antes de su ejecución, bob es null, al final de la llamada "bob"   
    es un apuntador a un objeto (referencia) con espacio reservado
    en RAM para contener sus valores de atributos y sus apuntadores 
    a métodos.

    ¿Por qué el constructor no es un método?
    
    * No puedo llamar al constructor usando el operador de indirección.
    * Carece de valor de retorno.
    * No puede ser REDEFINIDO
    * No puede ser declarado con un type.

    Herencia: Es un mecanisco que permite que un objeto adquiera todas
              las propiedades y comportamientos de un ancestro.

              La idea de la herencia es que puedan crear nuevas clases 
              a partir de las ya existentes.

    Clasificación de la herencia:
    
    Relaciones entre clases:
        *Asociación
        *Composición
        *Agregación
        *Herencia

        Hay un termino que permite distinguir los tipos de relaciones,
        llamado ACOPLAMIENTO

        *Medida de dependencia que hay entre 2 modulos. Existen grados 
        de acoplamiento (bajo y alto).

        *Cada clase y metodo hace una sola cosa y la hace bien (COHESIÓN).
        Número de tareas que tiene cada clase o metodo.

        Es deseable que 2 o más modulos de un programa mantengan alta cohesión
        y bajo acoplamiento.

    Asociación (ES UN): Cuando entre 2 o más clases se da una interacción
    que no modifica en nada el comportamiento de los objetos antes o después
    de terminar la relación.

    La asociación es un modo de interacción entre objetos donde uno utiliza
    los servicios de otros a corto plazo.

    La asociación es una relación de objeto debilmente acoplada.
    (BAJO ACOPLAMIENTO -> INDEPENDIENTES)

    Agregación (TIENE UN): Es una relación de objeto que afecta el 
    comportamiento entre ellos mientras ue dura la relación. Es decir, 
    un objeto depende de los servicios de otro a largo plazo.
    (ALTO ACOMPLAMIENTO)

    Composición (CONTIENE):Cuando un objeto complejo usa otros objetos
    permanentemente. 
    La composición es una relación entre objetos cuya escencia tiene sentido
    solo cuando ellos estan acoplados. Por ultimo podemos decir que la
    composición es un tipo de agregación a muy largo plazo.

    Herencia: Cuando un objeto tiene las caracteristicas de otro permanentemente,
    tendremos una relación entre objetos intimamente acoplados cuya existencia
    depende deun acestro irrenunciablemente.

    Firma o Signatura de un metodo.
    Es lo que permite distinguir sin ambigüedad a los métodos tanto 
    en la declaración como en la invocación (Emisión de mensajes)
    
    3 elementos:
    *Valor de retorno (tipo): doble
    *Nombre del método: pow
    *Número, tipo y orden de los parámetros -> Math.pow(x,2) - Math.pow(2,x)

En la herencia además de producir una clase nueva basada en una 
antigua añadiendo características adicionales (especialización); puedes
extender el comportamiento de la superclase.

Si un todo se define en la subclase de modo que el nombre, el tipo de 
retorno y su lista de parámetros coinciden exactamente con algún método
de la clase ancestro, entonces ese nuevo método que REDEFINE el comportamiento
del antiguo.

Los métodos con el mismo nombre, pero diferentes lista de parámetros dentro
de la misma clase, se consideran simplemente SOBRECARGADOS. 
Esto provoca que el compilador utilice los argumentos proporcionados en un 
mensaje para determinar a cual metodo se ha de llamar.

*To Overload <- Sobrecarga
*To Override <- Redefinir (Sobremontar)
*To Overwrite<- Sobreescribir
   

Diferencias: 
Override: Método con la misma signatura en distintas clases (de una jerarquia
de herencia)

Overload: Método con el mismo nombr que en la clase y distinta signatura

Reglas para redefinir (override)
1.- El tipo de retorno del método redefinido debe ser identico al del método
    que redefine.
2.- Un método redefinido no puede ser menos accesible que el método al 
    que redefine.
        superclase publica, el redefinido no puede ser protected
3.- Un método redefinido no puede lanzar excepciones diferentes al método 
    que redefine.

Diferencia entre sobrecarga y redefinición:

*La sobrecarga (overload) puede codificarse en una sola clase y la redefinición
(override) requiere 2 o más clases.

Los métodos sobrecargados tienen distinta signatura
Los métodos redefinidos tienen la misma signatura

Polimorfismo:
    Existen 3 formas de polimorfismo
    1.- Primitivo: Se implementa gracias a la sobrecarga de métodos.
    2.- Real: Se implementa gracias a la redefinición de métodos.
    3.- Generico: Se implementa gracias a las clases genericas.

"Una variable es polimorfica cuando puede referirse a objetos de clases
diferentes y en consecuencia puede adoptar distintos comportamientos"

Clases abstractas
Clases genericas
Interfaces
Objetos anónimos: Sin nombre

El polimorfismo permite desplegar comportamientos en las subclases de una 
jerarquia de herencia cuando ellas activan métodos con la misma firma o 
signatura.

Jerarquias de herencia:

*Simple
*
*

Ej: Empleado e = new Administrador();
Para manipular al empleado como si fuera un admin, es necesario modelar 
el tipo de la subclase.
El hecho de que una variable apuntadora a un objeto (Como variable "e")
pueda referirse automaticamente a tipos multiples se llama polimorfismo.

La JVM automaticamente selecciona el método apropiado a tiempo de ejecución,
lo que se denómica "LIGADURA DINÁMICA".
En conclusión todas las variables tipos superclase concretas son polimorficas.



*/

//MARTES
public class Abstraccion {
    void run(){
        System.out.println("La bici corre velozmente");
    }
    
    public static void main(String[] args){
        Abstraccion ab = new Abstraccion();
        ab.run();
        
        Bici bici = new Magistroni();
        bici.run();
        bici.changeColor();
    }
}

abstract class Bici{
    Bici(){ System.out.println("La bicicleta se creo");}
    
    abstract void run();
    
    void changeColor(){ System.out.println("Color cambiado"); }
}

class Magistroni extends Bici{

    Magistroni(){
        System.out.println("Soy una bici Magistroni");
    }   
    
    @Override
    void run() {
        System.out.println("Soy una bicicleta");
    }
    
}