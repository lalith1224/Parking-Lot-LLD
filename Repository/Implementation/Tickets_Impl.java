package Repository.Implementation;
import Model.Entity.Ticket;
import Repository.Tickets;

import java.util.ArrayList;
import java.util.List;

public class Tickets_Impl implements Tickets {
    List<Ticket> tlist =new ArrayList<>();
    List<Ticket> clist =new ArrayList<>();
    public Ticket addTicket(Ticket t)
    {
        tlist.add(t);
        return t;
    }
    public void CaddTicket(Ticket t)
    {
        clist.add(t);
    }
    public void remove(Ticket t)
    {
        tlist.remove(t);
    }
    public List<Ticket> getallTicket()
    {
        return tlist;
    }

    
}
