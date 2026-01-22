package Service;
import Model.Entity.Billing;
import Model.Entity.Ticket;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
public interface ParkingService
{
    Ticket generateTicket(String vtype,String pfloor,String cname,String vnumber,LocalDateTime pst);

    Ticket cancelTicket(String pid,LocalDateTime pet);

    public Map<String,Integer> get_avaliability();

    List<Billing> getall_vehicle();

  

}
