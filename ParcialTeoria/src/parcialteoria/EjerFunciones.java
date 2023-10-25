/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialteoria;

/**
 *
 * @author bauti
 */
public class EjerFunciones 
{
    int i=3;
    static int atributo=2;
    
    public static void main(String[] args) {
        var a= 3;
        
        System.out.println("a = " + a); // variable local al metodo main
        System.out.println("i = " + new EjerFunciones().i); //atributo de instancia de clase (objeto)
        System.out.println("atributo = " + atributo); //atributo de la clase
    }
}
