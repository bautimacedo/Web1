/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialteoria;

/**
 *
 * @author bauti
 */
public class parcialteoria 
{
    private int gb_used;
    private int total_cost;
    private int payment_month;
    private int payment_day;
    private String recargo;
    
    public parcialteoria(){}
    
    public parcialteoria(int gb_used , int total_cost , int payment_month, int payment_day , String recargo)
    {
        this.gb_used=gb_used;
        this.total_cost=total_cost;
        this.payment_month=payment_month;
        this.payment_day=payment_day;
        this.recargo=recargo;
    }        
    
    public void setGb(int gb_used)
    {
        this.gb_used=gb_used;
    }        
    
    public int getGb()
    {
        return gb_used;
    }        
    
    public void setTotal(int total_cost)
    {
        this.total_cost=total_cost;
    }        
    
    public int getTotal()
    {
        return total_cost;
    }        
    
       public void setMonth(int payment_month)
    {
        this.payment_month=payment_month;
    }        
    
    public int getMonth()
    {
        return payment_month;
    }        
    
    public void setDay(int payment_day)
    {
        this.payment_day=payment_day;
    }        
    
    public int getDay()
    {
        return payment_day;
    }     
    
    public void setRecargo(String recargo)
    {
        this.recargo=recargo;
    }        
    
    public String getRecargo()
    {
        return recargo;
    } 
    
}
