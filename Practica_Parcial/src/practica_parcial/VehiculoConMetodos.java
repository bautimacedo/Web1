/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

/**
 *
 * @author bauti
 */
public class VehiculoConMetodos 
{
    public void vroom()
    {
        System.out.println("Vroom");
    }
}

class Auto extends VehiculoConMetodos
{
    //Cada vez que usamos "Super" nos referenciamos a la clase padre
    //en vez de escribir int max speed, extendemos la clase a vehiculo para heredar
    @Override
    public void vroom()
    {
        super.vroom(); // llama al metodo vroom de la clase padre
    }
}


class Main{
    public static void main(String[] args) {
        Auto c = new Auto();
        c.vroom();
        
    }
}
