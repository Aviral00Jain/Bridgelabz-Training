import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
      
        double km;

       
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();   // as mentioned in hint

        // Convert km to miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Display output
        System.out.println(
            "The total miles is " + miles + " mile for the given " + km + " km"
        );

        // Close scanner
        input.close();
    }
}
