/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author bauti
 */
public class EjercicioDias 
{
    private int anio;
    private int mes;
    private int dias;
    
    
    public EjercicioDias(int anio, int mes, int dias)
    {
        this.anio=anio;
        this.mes=mes;
        this.dias=dias;
    }        
    
    public EjercicioDias(){}
    
    public void setAnio(int anio){
        this.anio=anio;
    }
    public int getAnio(){
        return anio;
    }
    
    public void setMes(int mes){
         this.mes=mes;
    }
    public int getMes(){
        return mes;
    }
    
    public void setDias(int dias){
        this.dias=dias;
    }
    public int getDias(){
        return dias;
    }
    
    private int fechasToDias(){
        return 360*anio+30*mes+dias;
    }
    
    private void diasToFecha(int i){
        anio= (int) i /360;
        int resto = i%360;
        mes= (int) resto / 30;
        dias = resto % 30;
        if(dias==0){
            dias=30;
            mes--;
        }

        if(mes==0){
            mes=12;
            anio--;
        }
        
    }
    
    public void addDias(int d){
        int sum = fechasToDias() + d;
        diasToFecha(sum);
    }
    
    public EjercicioDias(String s){
        int pos1=s.indexOf("/");
        int pos2=s.lastIndexOf("/");
        String sDia = s.substring(0,pos1);
        dias = Integer.parseInt(sDia);
        String sMes= s.substring(pos1+1,pos2);
        mes=Integer.parseInt(sMes);
        String sAnio=s.substring(pos2+1);
        anio=Integer.parseInt(sAnio);    
    }
    
    public String toString(){
        return dias+"/"+mes+"/"+anio;
    }
    
    public boolean equals(Object o){
        EjercicioDias otro = (EjercicioDias)o;
        return (dias==otro.dias)&&(mes==otro.mes)&&(anio==otro.anio);
    }
    
}
