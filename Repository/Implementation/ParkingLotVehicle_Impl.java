package Repository.Implementation;
import Model.Entity.Billing;
import Repository.ParkingLotVehicle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParkingLotVehicle_Impl  implements ParkingLotVehicle{

    private final List<Billing> list =new ArrayList<>();
    public ParkingLotVehicle_Impl()
    {
        add_mock_data();
    }
    

    public void add_vehicle(Billing b)
    {
        list.add(b);
    }
    public int getCost(Billing b)
    {
        for(Billing b1:list)
        {
            if(b1.getVtype().equals(b.getVtype()))
            {
                return b1.getCost();
            
            }
        }
        return -1;
    }
    public void remove_vehicle(String vtype)
    {
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            Billing b=(Billing)it.next();
            if(b.getVtype().equals(vtype))
            
             it.remove();
             return;
        }
    }
    
    public List<Billing> getall_vehicle()
    {
        return list;
    }

    public void add_mock_data() {
        add_vehicle(new Billing(10, "Car"));
        add_vehicle(new Billing(20, "Bike"));
        add_vehicle(new Billing(50, "Truck"));
    }

   
     
    
}
