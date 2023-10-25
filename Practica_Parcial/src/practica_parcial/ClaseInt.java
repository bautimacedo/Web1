/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;


interface WaterBottleInterface
{
    String color = "Blue";
    
    void fillup();
}
/*Una interfaz contiene metodos abstractos queson metodos sin la implementacion
estas interfaces pueden ser llamadas por los diferentes clases pero deben escribir
la implementacion de el metodo abstract de la implementacion sino tira error.
como definir una interfaz:
interface intej
{
    void hola();
    //ahora si llamamos esta interfaz en la calse, hay que definir "hola" si o si
    
}*/

public class ClaseInt implements WaterBottleInterface //Implementa la interfaz
{

    @Override
    public void fillup() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    
    }
//Es decir, si una clase implementa una interfaz, TODOS los metodos de la intefaz
//Deben ser llamados a la clase
    
    public static void main(String[] args) 
    {
        System.out.println(color);
        ClaseInt ex = new ClaseInt();
        ex.fillup();
        //El objeto de la clase utiliza fillup que es un metodo abstracto de la interfaz
    }
}
    