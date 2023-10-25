/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

//Polimorfismo = Muchas Formas
class Pajaro
{
    public void sing()
    {
        System.out.println("tweet tweet tweet");
    }
}

class Paloma extends Pajaro 
{
     @Override
     public void sing()
    {
        System.out.println("tweetleedd");
    }
}

class Aguila extends Pajaro
{
    
}
public class Polimorfismo 
{
    public static void main(String[] args)
    {
        Pajaro b = new Pajaro();
        b.sing();
        Paloma c = new Paloma();
        c.sing();
        //Aunque  el objeto sabe dos metodos para cantar
        //Prioriza el que esta espcificamente en su clase
        //Si borramos el sing  de Paloma, automaticamente
        //va a usar el sing de la clase padre. 
        //Eso es polimorfismo, tener varias formas de usar un metodo pero el objeto prioriza el de la propia clase
    }
}
