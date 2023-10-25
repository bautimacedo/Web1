/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bauti
 */
public class Cuenta {
 public String nombre;
 public double saldo;
 public int numero;
 public String tipo;
 public void depositar(double deposito)
 {
     saldo = saldo + deposito;
 }
 public void retirar(double retiro)
 {
     if(saldo>=retiro)
         saldo-=retiro;
     else
     {
         System.out.println("No hay saldo suficiente");
     }    
 }
 public void imprimir () 
 {
     System.out.println("\nNombre: "+ nombre + "\nSaldo: " + saldo + "\nNumero de Cuenta: " + numero + "\nTipo de Cuenta: " + tipo);
 }
}
