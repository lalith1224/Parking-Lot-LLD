import Controller.Api;
import Repository.*;
import Repository.Implementation.ParkingLotPlace_Impl;
import Repository.Implementation.ParkingLotVehicle_Impl;
import Repository.Implementation.Tickets_Impl;
import Service.*;
import Service.Implementations.*;
import View.Frontend;
import java.util.Scanner;
public class Main {


    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);
        //Object for the Repository
        Tickets t=new Tickets_Impl();
        ParkingLotVehicle p=new ParkingLotVehicle_Impl();
        ParkingLotPlace pl=new ParkingLotPlace_Impl();

        // Object for the Model
         AdminService as=new AdminServiceImpl(pl,p);
         ParkingService ps=new ParkingServiceImpl(t,p,pl);
         
        // Object for the View 
         Frontend f=new Frontend(sc);


        // Object for the Controller
          Api  ap= new Api(sc,f,as,ps);
        
             
         
          ap.Mainview();
         

    




    }
    
}

