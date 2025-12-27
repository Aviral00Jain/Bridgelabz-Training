import java.util.Scanner;

public class DayOfWeek{
  public static void main(String[] args) {
  
  
  // creating scanner class object
  Scanner input = new Scanner(System.in);

    // taking input from command line arguments
	System.out.println("Enter month");
    int m = input.nextInt(); // month
	System.out.println("Enter day");
    int d = input.nextInt(); // day
	System.out.println("Enter year");
    int y = input.nextInt(); // year

    // creating logic
    int y0 = y -(14 - m)/ 12;
    int x = y0+ y0/4 - y0/100 + y0/400;
    int m0 = m + 12 * ((14 - m)/12) - 2;
    int d0 = (d + x + (31 * m0)/ 12)% 7;

    // displaying result
    System.out.println(d0);
  }
}