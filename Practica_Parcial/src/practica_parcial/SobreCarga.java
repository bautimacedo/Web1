/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

public class SobreCarga
{
/*Sobrecarga sifgnifica tener varios metodos con el mismo nombre pero diferentes parametros*/

public static int addNumbers(int a, int b)
{
    return a + b;
}

public static double addNumbers(double a, double b)
{
    return a + b;
}

    public static void main(String[] args) {
        int rta = addNumbers(2,3);
        System.out.println(rta);
        double rta2 = addNumbers(3.1,5.6);
        System.out.println(rta2);
    }
}

//Por lo tanto, aunque tengas dos metodos con el mismo nombre, java
//Sabe cual usar dependiendo de los parametros que les des
//Podes hacer un addnumbers donde no se sume ningun numero
//Infinitas fomras de sobrecargar un metodo hay

//Los metodos se pueden llamar asi nomas porque estan inicilizados con static
//si no tuviesen static se deberia inicializar un obketo de la clase


