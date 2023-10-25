/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

class Perro2
{
        public void ladrar()
        {
            System.out.println("Ruf ruf");
        }
        
        public void cagar()
        {
            System.out.println("DDDD");
        }
}        
        
class Caniche extends Perro2
{
     @Override
     public void ladrar()
     {
            System.out.println("Massssimo");
     }
    
}

public class SobreEscritura
{
    public static void main(String[] args) 
    {
        Perro2 p = new Perro2();
        p.ladrar();
        Caniche c = new Caniche();
        c.ladrar();
        c.cagar();
        //El metodo del caniche sobreescribio el metodo del Perro2
        //a traves del polimorfismo y justamente por eso
        //c.ladrar(); imprimio "Masssssimo"
    }
    
}
