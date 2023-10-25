/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialteoria;

import java.util.Scanner;

/**
 *
 * @author bauti
 */
public class EjercicioArregloporTeclado 
{
    public static void main(String[] args)
    {
        var consola= new Scanner(System.in);
        System.out.println("Brindar largo de arreglo: ");
        var length= consola.nextLine();
        int[] enteros= new int[10];
        for(int ii=0 ; ii<10 ; ii++)
        {
            System.out.println("Brindarle un valor a entero["+ii+"]: ");
            enteros[ii]=Integer.parseInt(consola.nextLine());
        }    
        
        System.out.println("Impresion");
        for(int jj=0 ; jj<10 ; jj++)
        {
            System.out.println("Entero["+jj+"]= " + enteros[jj]);
        }    
    }
    
}
