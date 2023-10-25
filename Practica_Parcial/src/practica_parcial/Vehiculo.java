/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bauti
 */
package practica_parcial;
public class Vehiculo 
{
    int maxSpeed = 120;
}

class Auto extends Vehiculo
{
    //Cada vez que usamos "Super" nos referenciamos a la clase padre
    //en vez de escribir int max speed, extendemos la clase a vehiculo para heredar
    int maxSpeed = 100;
    public void display()
    {
        System.out.println(maxSpeed); //Utiliza la variable de la propia clase
    }
    
    public void displaysuper()
    {
        System.out.println(super.maxSpeed); //Utiliza la variable de la clase padre
    }
    
}


class Main{
    public static void main(String[] args) {
        Auto c = new Auto();
        c.display();
        c.displaysuper();
    }
}