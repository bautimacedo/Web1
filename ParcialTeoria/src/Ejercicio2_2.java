/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bauti
 */
public class Ejercicio2_2 
{
    public String nombre;
    public int saldo;
    private int numero;
    private String tipo;
    
    
    public Ejercicio2_2(){} //constructor vacio
    public Ejercicio2_2(String nombre, int saldo, int numero, String tipo)
    {
        this.nombre=nombre;
        this.saldo=saldo;
        this.numero=numero;
        this.tipo=tipo;
    }      
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }        
            
    public String getNombre()
    {
        return nombre;
    }        
    private void depositar(int deposito)
    {
        saldo = saldo + deposito;
    }        
    public void retirar(int retirar)
    {
        if(retirar<=saldo)
        saldo-=retirar;
        else
            System.out.println("Cantidad Insuf");    
    }  
    
    public void imprimir()
    {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Saldo>" + saldo);
        System.out.println("Num>" + numero);
        System.out.println("Tipo> "+ tipo);
    }        
}
