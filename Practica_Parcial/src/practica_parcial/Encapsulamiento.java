/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

class Student
{
    private String name;
    private int age;
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getName()
    {
        return name;
    }
}
public class Encapsulamiento
{
    public static void main(String[] args)
    {
        /*Student s = new Student();
        s.name = "Tomas";
        s.age = 10;
        System.out.println(s.name);
        System.out.println(s.age);*/
        //Esto es correcto pero no es una buena practica para la POO
        //Ya que queremos llamar a metodos q hagan esto por nosotros
        
        Student s = new Student();
        s.setName("bauti");
        System.out.println(s.getName());
        /*El punto de encapsulamiento es abstraer las variables del usuario para qu sea mas simple
        usar el objeto, porque en realidad la clase Student no la va a ver el usuario*/
    }
}
