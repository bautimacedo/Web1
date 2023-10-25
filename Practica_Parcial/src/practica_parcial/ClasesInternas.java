/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

class Afuera
{
    int a = 0;
    class Adentro
    {
        int b = 5;
    }
}
public class ClasesInternas 
{
    public static void main(String[] args) 
    {
        Afuera o = new Afuera(); // o es un objeto de la clase Afuera
        Afuera.Adentro i= o.new Adentro(); // i es un objeto de la clase Adentro
        System.out.println(o.a + " " + i.b );
    }
}


//