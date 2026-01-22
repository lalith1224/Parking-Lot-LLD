package Model.Entity;
import java.time.LocalDateTime;
import util.idgenerator;


public class Ticket {
    private String  pid ;
    private Billing vtype;
    private String vnumber;
    private String pfloor;
    private String pslot;
    private String cname;
    private double  charge;
    private LocalDateTime  pst;
    private LocalDateTime pet;
    public  Ticket( Billing vtype,String pfloor,String cname,String vnumber,LocalDateTime pst)
    {
        this.pid=idgenerator.idgenerator()+""+pfloor;
        this.vtype=vtype;
        this.vnumber=vnumber;
        this.pfloor=pfloor;
        
        this.cname=cname;
        this.pst=pst;
        
    }
    public void  setpet(LocalDateTime pet)
    {
     this.pet=pet;
    }
    public void setcharge(double charge)
    {
        this.charge=charge;
    }
    public double getcharge()
    {
        return charge;
    }
    public String getPid() {
        return pid;
    }
    public Billing getVtype() {
        return vtype;
    }
    public String getVnumber() {
        return vnumber;
    }
    public String getPfloor() {
        return pfloor;
    }
    public String getPslot() {
        return pslot;
    }
    public String getCname() {
        return cname;
    }
    public LocalDateTime getpst() {
        return pst;
    }
    public LocalDateTime getpet()
    {
        return pet;
    }
    
    public  String toString()
    {
        return "\n The Ticket Id :"+pid +
        "\n The Coustomer Name :"+ cname +
        " \n The Parked floor :"+ pfloor 
        + "\n The vehicle Type :"+vtype.getVtype() 
        + "\n The Parked Slot :"+pslot 
        + "\n Vehicle Number :"+vnumber 
        + "\n The Enty Time :"+pst 
        +"\n The Exit Time :"+pet 
        + "\n The Charged Amount : "+charge ;
    }
    

    
}
