package Controller;
import Model.Entity.Ticket;
import Service.*;
import View.Frontend;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Api {
    private Frontend frontend;
    private AdminService as;
    private ParkingService ps;
    private Scanner sc;
    public Api(Scanner sc,Frontend f,AdminService as,ParkingService ps)
    {
        this.frontend=f;
        this.as=as;
        this.ps=ps;
    }

    public void Mainview()
    {
        boolean outer_exit=true;
        while(outer_exit)
        {
         frontend.showmessage("\nWelcome to Parking Our Lot");
         
         frontend.showmessage("\n1.Park Vehicle \n2.Exit From the Parking Lot : \n3.Admin Service \n4.Exit");
         frontend.showmessage("\nEnter the Choice :");
         int choice = frontend.intget();
         
         switch(choice)
         {
            case 1:
              frontend.showmessage("\nEnter the Name :");
              String cname=frontend.getString();
              frontend.showmessage("\nEnter the Vehicle Number :");
              String vnumber=frontend.getString();
              frontend.showmessage("\nThe Parkable Vehicle and Cost Per Hour :");
              frontend.printlist(ps.getall_vehicle());
              frontend.showmessage("\nEnter the Vtype :");
              String vtype=frontend.getString();
              frontend.showmessage("\nThe Available Parking Lot's :");
              frontend.printlist(ps.get_avaliability());
              frontend.showmessage("\nEnter the Floor :");
              String pfloor=frontend.getString();
              frontend.showmessage("\nThe Time you will get charged is Starting form :");
              LocalDateTime pst=LocalDateTime.now();
              
              frontend.showmessage(" " +pst);
              
               Ticket t=ps.generateTicket( vtype, pfloor, cname, vnumber, pst);
               if(t!=null)
               {
                    frontend.showmessage("\nYour Ticket :");
                    frontend.showmessage(t);
               }
               else{
                   frontend.showmessage("\nInvalid Parking Lot or Parking Lot full !");
               }
            
            break;

            case 2:
               frontend.showmessage("\nEnter the Ticket Id :");
               String pid=frontend.getString();
               frontend.showmessage("\nThe Exit Time :");
               LocalDateTime pet=LocalDateTime.now();
               frontend.showmessage(  " " +pet);
               Ticket ct=ps.cancelTicket(pid,pet);
               if(ct!=null)
               {
               frontend.showmessage("\nYour Ticket :");
               frontend.showmessage(ct);
               }
               else{
                   frontend.showmessage("\nInvalid Ticket Id !");

                }
               break;
             case 3:
                boolean exit=false;
                while(!exit)
                {
                frontend.showmessage("\nThe Current Available Parking Lot's :");
                frontend.printlist(ps.get_avaliability());
                frontend.showmessage("\nThe Fixed Available Parking Lot's :");
                frontend.printlist(as.getfixed_avaliability());
                frontend.showmessage("\nThe Available Vehicle :");
                frontend.printlist(ps.getall_vehicle());
                frontend.showmessage("\n1.Add Capacity \n2.Add Vehicle or Edit Vehicle \n3.Remove Vehicle \n4.Exit");
                frontend.showmessage("\nEnter the Choice :");
                 int inner_choice = frontend.intget();
                 switch(inner_choice)
                 {
                    case 1:
                       frontend.showmessage("\nEnter the Floor :");
                       String floor=frontend.getString();
                       frontend.showmessage("\nEnter the Capacity :");
                       int capacity=frontend.intget();
                       as.addParkingLotPalce(floor,capacity);
                       break;
                    case 2:
                       frontend.showmessage("\nEnter the Vehicle Type :");
                       String type=frontend.getString();
                       frontend.showmessage("\nEnter the Cost :");
                       int cost=frontend.intget();
                       as.add_vehicle(type,cost);
                       break;
                    case 3:
                        frontend.showmessage("\nEnter the Vehicle Type :");
                       String type1=frontend.getString();
                       as.remove_vehicle(type1);
                       break;
                    case 4:
                        exit=true;
                        break;
                    default:
                       frontend.showmessage("Invalid Input !....");

                    }
                }
                break;
                case 4:
                  outer_exit=false;
                  break;

            default:
               frontend.showmessage("Invalid Input");



              
            }
         }


    }



    
    
}
