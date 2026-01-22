package Service;
import java.util.Map;

public interface AdminService {

    void addParkingLotPalce(String floor,int capacity);
    Map<String,Integer> get_capacity();
    Map<String,Integer> get_avaliability();
    public Map<String,Integer> getfixed_avaliability();
    void add_vehicle(String vtype,int cost);
    void remove_vehicle(String vtype);
    
    
    
    
}
