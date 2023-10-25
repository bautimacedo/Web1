/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

/**
 *
 * @author bauti
 */
public class Casting 
{
    public static void main(String[] args) 
    {
        byte bc = 1;
        int a =  (int) 0.5; //Castea el 0.5 a un entero y redondea a 0
        //Type casting te permite llevar una variable a otro tipo de variable
        //Siempre redondea hacia abajo
        int b = 500;
        int ex = bc;
        double ex2 = (double) b;
        System.out.println(ex2);
    }
}
