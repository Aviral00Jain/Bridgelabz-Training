import java.util.Scanner;

public class HarshadNumber {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number");
    int number = input.nextInt();

    // creating logic
      int sum = 0;
      int temp = number;
     while (temp != 0) {
       sum = sum + (temp % 10);
       temp = temp / 10;
      }

       //displaying result
         System.out.println(number%sum==0 ? "Harshad Number" : "Not a Harshad Number");

    // closing scanner class stream
    input.close();
  }
}