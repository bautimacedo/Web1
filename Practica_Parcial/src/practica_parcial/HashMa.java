/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

import java.util.HashMap;

/**
 *
 * @author bauti
 */
public class HashMa 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 5;
        int c = 0;
    
        HashMap <String,Integer> happy = new HashMap<>();
        happy.put("a",10);
        happy.put("Massi", 10);
        System.out.println(happy);
        // Imprime {a=10, Massi=10}
        
        System.out.println(happy.get("c"));
        // Nos da la clave de c
        
        HashMap <String,String> login = new HashMap<>();
        login.put("Bautimacedo", "hola1");
        login.put("Massi","Bertorelo");
        System.out.println(login);
        //{Bautimacedo=hola1, Massi=Bertorelo}
        login.
        login.remove("Massi");
        System.out.println(login);
        
        System.out.println(login.containsValue("hola1"));
    }
    
    
}
