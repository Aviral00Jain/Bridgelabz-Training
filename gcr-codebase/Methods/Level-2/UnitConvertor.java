import java.util.Scanner;
 
 public class UnitConvertor{
    
	// create methods
    public static double convertYardsToFeet(double yards){
       double feet = yards*3;	
	   return feet;
	   }
	   
	public static double feetToYards(double feet){
       double yards = feet/3;
	   return yards;
	   }
	   
	public static double metersToInches(double meters){
	   double inches = meters *  39.37;
	   return inches;
	   }
	  
	public static double inchesToMeters(double Inches){
        double meters = Inches / 39.37;
		return meters;
		}
		
	public static double inchesToCentimeters(double Inches){
	    double centiMeters = Inches *2.54;
		return centiMeters;
		}
	

	   
    public static void main(String [] args){
	
	// Scanner class object
	Scanner sc = new Scanner(System.in);
	
	//Taking input from user
	System.out.println("Enter number ");
	int n = sc.nextInt();

    // Calling methods and displaying result
	System.out.println("Number : " + n + " yards to feet : " +convertYardsToFeet(n));
    System.out.println("Number : " + n + " feet to yards : " +feetToYards(n));
	System.out.println("Number : " + n + " meters to inches : " +metersToInches(n));
	System.out.println("Number : " + n + " inches to meters : " +inchesToMeters(n));
	System.out.println("Number : " + n + " inches to centi meters : " +inchesToCentimeters(n));

     }
}	 
	 
 	
     