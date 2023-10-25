/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialteoria;

/**
 *
 * @author bauti
 */
public class PruebOperadores 
{
    public static void main(String[] args)
    {
        var a=3;
        var b=2;
        var c= (a==b);
        System.out.println("c = " + c);
        
        var cadena= "Hola";
        var cadena2= "Hola";
        var e= cadena==cadena2;
        System.out.println(cadena.equals(cadena2));
        System.out.println("e = " + e);
        
        var vacaciones=false;
        var descanso=false;
        if(vacaciones||descanso) 
            System.out.println("Padre puede asistir");
        else
            System.out.println("no");
        
        var resultado= (1>2) ? "verd" : "fals";
        System.out.println("resultado = " + resultado);
                
                
                
                
                
    }
    
}
