/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

/**
 *
 * @author bauti
 */

enum levels
{
    LOW, MEDIUM, HIGH; //Por conevncion se usa MAYUS
}
public class Enums 
{
   
    public static void main(String[] args) {
        //Si una clase y un array tuviesen un hijo
        //Lista de valores que no cambia
        //Pero esta guardada como una clase y se accede como tal
        System.out.println(levels.HIGH);
        levels niveles = levels.LOW;
        System.out.println(niveles);
        //Usamos enumeraciones para cosas que no cambian
        //Es mas facil usar esto antes que usar un array
        switch(l){
            case LOW:
                ///
                break;
            case MEDIUM:
                ///
                break;
        } //Ejemplo de uso
        if(niveles== niveles.HIGH)
        {
        }
        if(niveles=levels.LOW){
        }
            ///
            
        }
    }

