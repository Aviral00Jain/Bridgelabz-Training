import java.util.Scanner;

public class AbundantNumber {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	  System.out.println("Enter number");
      int number = input.nextInt();

    // creating logic
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0)
        sum = sum + i;
    }

    // displaying result
    System.out.println(sum > number ? "Abundant Number" : "Not an Abundant Number");

    // closing scanner class stream
    input.close();
  }
}