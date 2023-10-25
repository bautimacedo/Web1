
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bauti
 */
public class CuentaMain 
{
    public static void main(String[] args) 
    {
        Cuenta c1;
        c1 = new Cuenta();
        c1.nombre="Bautista Macedo";
        c1.saldo= 1000;
        c1.numero=44780197;
        c1.tipo="Debito";
        c1.depositar(2000);
        c1.retirar(100);
        c1.imprimir();
    }
}
