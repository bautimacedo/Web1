
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bauti
 */
public class ejercicio 
{
    public static void main(String[] args) 
    {
        var consola = new Scanner(System.in);
        System.out.println("Ingresar Descripcion: ");
        var descripcion = consola.nextLine();
        System.out.println("Ingresar Id: ");
        var id = consola.nextLine();
        System.out.println("Ingresar Precio");
        var precio = consola.nextLine();
        System.out.println("Tiene Envio Gratis (Si/No): ");
        var envio = consola.nextLine();
        if(envio=="Si")
            System.out.println("El producto tiene envio gratis");
        else
            System.out.println("El Envio tiene precio");    
            
            
        
    }
   
}
