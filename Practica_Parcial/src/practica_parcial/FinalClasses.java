/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

/**
 *
 * @author bauti
 */
public class FinalClasses
{
    final int MAX;
    final int MIN = 0;
    static final double PI = 3.14159;
    FinalClasses(){
        MAX = 5; //inicializando el valor en el constructor, si se puede
    }
    final public void sayHi() //No puede ser sobreescrito el metodo
    {
        System.out.println("Hi");
    }    
    
    public class FinalClasses2 extends FinalClasses{
        public void sayHi(){
            
        }
    }
    
    public static void main(String[] args) 
    {
        //Variable final no se le puede cambiar el valor
        //Una variable final se escribe en MAYUS, es buena practica
        
        FinalClasses f = new FinalClasses();
        System.out.println(f.MAX);
        f.sayHi();
        
    }
   
    
}
//Si tenes una clase final
final public class Final{

}// No podemos hacer una extension porq es final

class OtraClase extends Final{
    @Override
    public void sayHi(){ //no podemos sobre escribirlo porque fue escrito como final
        System.out.println("Hello");
    }
    
    
    
}


