package Repository;
import Model.Entity.Ticket;
import java.util.List;
public interface Tickets {
    

    Ticket addTicket(Ticket t);
    void CaddTicket(Ticket t);
    void remove(Ticket t);
     List<Ticket> getallTicket();
    
    
    
}
