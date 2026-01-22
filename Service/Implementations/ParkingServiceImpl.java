package Service.Implementations;
import Model.Entity.Billing;
import Model.Entity.Ticket;
import Repository.ParkingLotPlace;
import Repository.ParkingLotVehicle;
import Repository.Tickets;
import Service.ParkingService;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.List;


public class ParkingServiceImpl implements ParkingService {
   
      private Tickets t;
      private ParkingLotVehicle p;
      private ParkingLotPlace pl;


      public ParkingServiceImpl(Tickets t,ParkingLotVehicle p,ParkingLotPlace pl)
      {
        this.t=t;
        this.p=p;
        this.pl=pl;
      }
    
    
    public Ticket generateTicket(String vtype1,String pfloor,String cname,String vnumber,LocalDateTime pst)
    {
        if(! pl.check_capacity(pfloor))
        {
            return null;
        }
          Billing vtype=null;
        pl.reduce_capacity(pfloor);
        for(Billing b:p.getall_vehicle())
        {
            if(b.getVtype().equals(vtype1))
            {
                vtype=b;
            }
           
        }
        if(vtype==null)
            return null;
        
       
        return t.addTicket(new Ticket(vtype,pfloor,cname,vnumber,pst)); 
    }

    public Ticket cancelTicket(String pid,LocalDateTime pet)
    {
         double charge;
        for(Ticket x:t.getallTicket())
        {
            if(x.getPid().equals(pid))
            {        
                long duration =((Duration.between(x.getpst(),pet).toMinutes()) +59 )/60;
                charge= duration * p.getCost(x.getVtype());
                x.setpet(pet);
                x.setcharge(charge);
                t.remove(x);
                t.CaddTicket(x);
                pl.add_capacity(x.getPfloor(),pl.getsingle_capacity(x.getPfloor())+1);
                return x;
              
                
            }

        }
        return null;

       
    }
    public Map<String,Integer> get_avaliability()
    {
        return pl.get_avaliability();
    }

    public List<Billing> getall_vehicle()
    {
        return p.getall_vehicle();
    }

    
    



   

    
}
