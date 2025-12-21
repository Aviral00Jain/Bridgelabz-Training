import java.util.Scanner;
 
 public class UnitConvertorKM{
    
	// create methods
    public static double KmToMiles(double km){
       double miles = km/1.609;
;	
	   return miles;
	   }
	   
	public static double milesToKilometers(double miles){
       double km = miles*1.609;
	   return km;
	   }
	   
	public static double metersToFeet(double meters){
	   double feet = meters *  3.281;
	   return feet;
	   }
	  
	public static double feetToMeters(double feet){
        double meters = feet / 3.281;
		return meters;
		}
		

	

	   
    public static void main(String [] args){
	
	// Scanner class object
	Scanner sc = new Scanner(System.in);
	
	//Taking input from user
	System.out.println("Enter number ");
	int n = sc.nextInt();

    // Calling methods and displaying result
	System.out.println("Number : " + n + "  kilometers to miles : " +KmToMiles(n));
    System.out.println("Number : " + n + "  miles to kilometers : " +milesToKilometers(n));
	System.out.println("Number : " + n + " meters to feet : " +metersToFeet(n));
	System.out.println("Number : " + n + " feet to meters : " +feetToMeters(n));

     }
}	 
	 
 	
     