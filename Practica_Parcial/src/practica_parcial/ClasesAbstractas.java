/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

abstract class Perro
{
    String raza;
    public void ladrar()
    {
        System.out.println("Ruf Ruf");
    }
    public abstract void cagar();
}
//Un metodo abstracto es aquel metodo que no esta implementado
//Ej ---> public abstract void ladrar();
//Si metemos un metodo abstracto en Perro, su subclase caniche
//tiene que implementarlo si o si
class Caniche extends Perro{
    public void cagar(){
        System.out.println("El perro se echo una caca");
    }
}
public class ClasesAbstractas
{
    public static void main(String[] args) 
    {
       // Perro ema = new Perro();
        //ema.ladrar();
        
        Caniche ema2 = new Caniche();
        ema2.ladrar();
        System.out.println(ema2.raza);
        ema2.cagar();
        
        //Nos podemos preguntar, para que voy a usar el metodo abstracto,
        //Si directamente puedo escribir el metodo en el main?? Bueno, lasc 
        //clases abstractas nos ayudan a organizarnos y hacer que cada subclase
        //de la clase padre, tenga implementado el metodo si o si.
        
        
        
        /*
        Diferencia entre interffaz y clase abstracta.
        - En una interfaz, no podes tener metodos implementados, la intefaz
            asume que todos los metodos de ella son abstractos
        - Una clase abstracta puede tener una lista de metodos con metodos
            tanto implementadso como no implementados
        - En la interfaz unicamente tenes meetodos sin implementar
        . En la clase abstracta podes tener ambas, implementados y sin implementar
        */
    }
}
