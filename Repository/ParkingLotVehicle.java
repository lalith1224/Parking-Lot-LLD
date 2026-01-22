package Repository;
import  Model.Entity.Billing;
import java.util.List;
public interface ParkingLotVehicle
{
     
     void add_vehicle(Billing b);
     int  getCost(Billing b);
     void remove_vehicle(String vtype);
     List<Billing> getall_vehicle();
     

}