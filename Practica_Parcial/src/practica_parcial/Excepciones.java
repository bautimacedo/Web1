/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bauti
 */
package practica_parcial;
import java.util.ArrayList;

public class Excepciones 
{
    public static void main(String[] args) 
    {
        String array[] = {"Hola1","Hola2"};
        System.out.println(array[3]);
                /*Claramente te tira un error porque no hay array[3]
        
                Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
                Index 3 out of bounds for length 2 at 
                practica_parcial.Excepciones.main(Excepciones.java:16)*/
                
                //Notar la excepcion dice in thread main, es decir que fue en el main de la clase
                //java.lang.ArrayIndexOutOfBoundsException es el nombre de la excepcion
                //que justamente es lo que sucedio, hay un index fuera de los limites del array
                //Index 3 out of bounds for length 2 porque utilice el arreglo[3] y su longitud es [2]
                
        int i = "Bauti";
        /*Exception in thread "main" java.lang.RuntimeException:
        Uncompilable code - 
        incompatible types: java.lang.String cannot be converted to int
	at practica_parcial.Excepciones.main(Excepciones.java:1)*/
        
        //Nuevamente se utiliza in thread main para notificar que fue en el main
        //string no puede ser convertido a entero en "ubicacion del archivo"
        
        
        //Es muy util para debugging porque te aparece la excecpion y te da una
        //descripcion de lo que paso para que el programa se rompa, incluso
        //te da la linea donde sucedio el error
        
        ArrayList<String> list = new ArrayList<String>();
        list.get(0); 
        /*Exception in thread "main" java.lang.IndexOutOfBoundsException: 
            Index 0 out of bounds for length 0
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.util.Objects.checkIndex(Objects.java:385)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at practica_parcial.Excepciones.main(Excepciones.java:46)*/
        
        //Nuevamente explica lo que sucedio, no hay ningun elemento en list
        
        ArrayList<String> list2 = null;
        list2.get(0);
        /*Exception in thread "main" java.lang.NullPointerException:
        Cannot invoke "java.util.ArrayList.get(int)" because "list2" is null
	at practica_parcial.Excepciones.main(Excepciones.java:59)*/
        
        //NullPointerException -> significa que estas intentando de extraer el objeto 0
        //de la lista que no existe, la lista existe, pero a la vez no esta ahi porque
        //esta inicializada en null
    }
}
