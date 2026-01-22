package View;
import Model.Entity.Billing;
import Model.Entity.Ticket;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Frontend {
   Scanner sc;
   
   public Frontend(Scanner sc)
   {
     this.sc=sc;
   }
   public void showmessage(String msg)
   {
      System.out.print(msg);

   }
   
   public void showmessage(Ticket t)
   {
      System.out.println(t);
   }

   public int intget()
   {
      return sc.nextInt();
   }

   public String getString()
   {
      return sc.next();
   }
   public void printlist(Map<String,Integer> x)
   {
        for(Map.Entry<String,Integer> e: x.entrySet())
        {
            showmessage("\nThe Floor :"+ e.getKey() + "  avaliable slots :" + e.getValue() );
        }

   }

   public void printlist(List<Billing> x)
   {
      for(Billing b:x)
      {
         System.out.println(b);
      }
   }


    
}
