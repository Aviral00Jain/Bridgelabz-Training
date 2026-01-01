import java.util.*;
public class ParkingLotSystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int totalCapacity = 10;
        int parkedCars = 0;
        int choice = 0;
        
        while(choice != 4){
             System.out.println("--- Parking Lot Menu ---");
             System.out.println("1. Park");
             System.out.println("2. Exit");
             System.out.println("3. Show Occupancy");
             System.out.println("4. Exit System");
             System.out.print("Enter your choice: ");
             choice = sc.nextInt();
 
             switch(choice){
       
                case 1:
                if(parkedCars == 10){
                  System.out.println("Parking lot is full");
                  choice = 4;
                }else{
                  System.out.println("Car parked successfully");
                  parkedCars += 1;
                }
                break;


                case 2:
                parkedCars -= 1;
                System.out.println("Car exit the parking lot successfully");
                break;


                case 3:
                System.out.println("Total cars parked : " + parkedCars);
                System.out.println("Occupancy of parking lot is : " + (totalCapacity - parkedCars)); 
                break;


                case 4:
                System.out.println("Exiting the system");
                break;
           }
        }
        sc.close();
    }
}