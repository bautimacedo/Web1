
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bauti
 */
public class Tema4 
{
    public static void main(String[] args) 
    {
        var edad= Integer.parseInt("20"); //convertir string a entero
        System.out.println("edad = " + edad);
        var doublePi= Double.parseDouble("3.14");
        System.out.println("doublePi = " + doublePi);
        var consola = new Scanner(System.in);
        System.out.println("Brindar valor de numero: ");
        //edad = Integer.parseInt(consola.nextLine());
        //System.out.println("consola = " + edad);
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var caracter = "Hola".charAt(1);
        System.out.println("caracter = " + caracter); 
        System.out.println("Brindar un caracter: ");
        caracter = consola.nextLine().charAt(5);
        System.out.println("caracter = " + caracter);
    }
   
}
