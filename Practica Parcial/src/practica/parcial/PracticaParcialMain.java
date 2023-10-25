/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.parcial;

import java.util.Scanner;

/**
 *
 * @author bauti
 */
public class PracticaParcialMain
{
    static final int FILAS= 6;
    static final int COLUMNAS=6;
    
    public static void main(String[] args)
    {
        
        int[][] arreglo = new int[FILAS][COLUMNAS];
        
        var consola=new Scanner(System.in);
        
        for(int ii=0 ; ii< FILAS ; ii++)
        {
            for(int jj=0 ; jj< COLUMNAS ; jj++)
            {
                arreglo[ii][0]=ii;
                System.out.println("Cuantos gb consumio el Cliente "+ii);
                arreglo[ii][1]= consola.nextInt();
                System.out.println("");
            }    
        }    
    }
}
