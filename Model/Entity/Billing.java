package Model.Entity;

public class Billing {
   private int  cost ;
   private String Vtype;
   public Billing(int  cost,String Vtype)
   {
       this.cost=cost;
       this.Vtype=Vtype;
   }
    
   public String getVtype()
   {
     return Vtype;
   }
   public void setVtype(String Vtype)
   {
    this.Vtype=Vtype;
   }
   public int getCost()
   {
    return cost;
   }
   public void setcharge(int cost)
   {
        this.cost=cost;
   }
    public String toString()
    {
        return "\n The Vechicle :"+Vtype +" The Cost :"+cost;
    }

}
