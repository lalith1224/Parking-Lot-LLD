package Repository.Implementation;
import java.util.HashMap;
import java.util.Map;

import Repository.ParkingLotPlace;

public class ParkingLotPlace_Impl implements ParkingLotPlace{
    private final Map<String,Integer> list=new HashMap<>();
    private final Map<String,Integer> avaliable_list=new HashMap<>();

    public ParkingLotPlace_Impl()
    {
        add_mock_data();
    }
    

    public  void reduce_capacity(String fname)
    {
        avaliable_list.put(fname,avaliable_list.get(fname)-1);
    }
    public boolean check_capacity(String fname)
    {
        if(list.containsKey(fname))
        {
        if(avaliable_list.get(fname)>0)
        {
            return true;
        }
    }
        return false;
    

    }
    public int getsingle_capacity(String fname)
    {
        return avaliable_list.get(fname);
    }
    public void add_capacity(String fname,int capacity)
    {
        list.put(fname,capacity);
        avaliable_list.put(fname,capacity);
    }
    public Map<String,Integer> get_capacity()
    {
        return list;
    }
    public  Map<String,Integer> get_avaliability()
    {
        return avaliable_list;
    }
     public  Map<String,Integer> getfixed_avaliability()
    {
        return list;
    }

   
      void add_mock_data() {
         add_capacity("A", 10);
          add_capacity("B", 15);
          add_capacity("C", 15);
         add_capacity("D", 15);
          add_capacity("E", 15);
    }




    
    
}
