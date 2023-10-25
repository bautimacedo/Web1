/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bauti
 */
public class Iterators 
{
    public static void main(String[] args) 
    {
        //Un iterador es una herramienta que te deja loopear a traves de una coleccion
        //x ejemplo un Arraylist,Hashmap
        ArrayList<String> foods = new ArrayList<>();
        foods.add("pizza");
        foods.add("ice cream");
        foods.add("chicken");
        foods.add("Iteraador");
        /*Objeto que nos prmite recorrer elementos de una coleccion sin saber los detalles
        de como se almacenarn estos elementos. Es como tener un pointer que te permite 
        avanzar secuencialmente a traves de una coleccion*/
        Iterator<String> it = foods.iterator(); //it es un iterador de las comidas
        System.out.println(it.next()); //pizza
        System.out.println(it.next()); // icecream
        System.out.println(it.next()); // chicken
        
        System.out.println(it.equals("chicken"));
        
    }
}
