package Repository;
import java.util.Map;

public interface ParkingLotPlace {
    
    void reduce_capacity(String fname);//user
    boolean check_capacity(String fname);//user
    void add_capacity(String fname,int capacity);//admin
     public int getsingle_capacity(String fname);//user
     Map<String,Integer> get_capacity();//admin
     public  Map<String,Integer> getfixed_avaliability();//admin
     Map<String,Integer> get_avaliability();
}
