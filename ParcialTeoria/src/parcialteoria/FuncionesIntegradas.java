/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialteoria;

/**
 *
 * @author bauti
 */
public class FuncionesIntegradas 
{
    public static void main(String[] args) 
    {
    
        var cadena="Hola";
        System.out.println("Largo Cadena "+ cadena.length());
        for(int i=0 ; i< cadena.length() ; i++)
        {
            System.out.println(i+"-"+ cadena.charAt(i));
        }    
    }

}
