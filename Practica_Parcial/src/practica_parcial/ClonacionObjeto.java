/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_parcial;

/**
 *
 * @author bauti
 */
public class ClonacionObjeto 
{
    public static void main(String[] args) {
        
    }
    
}

class Estudiante implements Cloneable
     {
            private String cod;
            private String nombres;
            
            public Estudiante(){
                
            }
            
            public Estudiante(String cod,String nombres)
            {
                this.cod=cod;
                this.nombres=nombres;
            }
            
            public void setCodigo(String cod)
            {
                this.cod=cod;
            }
            public void setNombres(String nombres)
            {
                this.nombres=nombres;
            }
             public String getCodigo()
            {
                return cod;
            }
            public String getNombres()
            {
                return cod;
            }
            
            
            public Object clone() throw CloneNotSupportedException{
                
            }
     }