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
public class IngresarTeclado2 
{
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Brindar Nombre: ");
        var nombre= consola.nextLine();
        System.out.println("Dar edad: ");
        var edad= Integer.parseInt(consola.nextLine());
        System.out.println("nombre = " +nombre );
        System.out.println("edad = " + edad);
    }
    
}
