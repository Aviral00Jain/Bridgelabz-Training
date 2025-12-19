import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number");
    int number = input.nextInt();

    // creating logic
    int originalNumber = number;
    int sum = 0;
    while (originalNumber != 0) {
      int digit = originalNumber % 10;
      sum = sum + (digit * digit * digit);
      originalNumber = originalNumber / 10;
    }

    // displaying result
    System.out.println(sum == number ? "Armstrong Number" : "Not an Armstrong Number");

    // closing scanner class stream
    input.close();
  }
}