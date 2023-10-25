/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

interface InterfazPadre
{
    public int mortal(HashMap<String,Integer> atletas);
    
}

interface InterfazHija extends InterfazPadre
{
    //No hay ningun metodo aqui pero como extiende a la interfaz padre
    //La clase cuando implementa esta interfaz tiene que ingresar el metodo mortal
}
public class HeredInterf implements InterfazHija
{

    @Override
    public int mortal(HashMap<String,Integer> atletas)
    {
       ArrayList<String> nombrar = new ArrayList<>();
       
        
        return 0;
    }
    
    public static void main(String[] args)
    {
        Random random = new Random();
        int counter = 0;
        Scanner Scanner = new Scanner(System.in);
        HashMap<String,Integer> atletas = new Hashmap<>();
        System.out.println("Cuantos atletas queres poner: ");
        int participantes = Scanner.nextInt();
        while(counter!=participantes)
        {
            counter++;
            System.out.println("Nombre del atleta Nª" + counter);
            atletas.put(Scanner.nextLine(),random.nextInt(4));
        }
        
        
    }
}
