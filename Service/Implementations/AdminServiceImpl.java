package Service.Implementations;
import Model.Entity.Billing;
import Repository.ParkingLotPlace;
import Repository.ParkingLotVehicle;
import Service.AdminService;
import java.util.Map;
public class AdminServiceImpl implements  AdminService {

      private ParkingLotPlace pl;
      private ParkingLotVehicle plv;


    public AdminServiceImpl(ParkingLotPlace pl,ParkingLotVehicle plv) {
        this.pl = pl;
        this.plv=plv;
    }
  
    public void addParkingLotPalce(String floor,int capacity)
    {
        pl.add_capacity( floor, capacity);
    }

    public void add_vehicle(String vtype,int cost)
    {
        plv.add_vehicle(new Billing(cost,vtype));
    }

    public void remove_vehicle(String vtype)
    {
        plv.remove_vehicle(vtype);
    }


    public Map<String,Integer> get_capacity()
    {
       return pl.get_capacity();
    
    }

    public Map<String,Integer> get_avaliability()
    {
        return pl.get_avaliability();
    }


    
    public Map<String,Integer> getfixed_avaliability()
    {
        return pl.getfixed_avaliability();
    }


    
}
