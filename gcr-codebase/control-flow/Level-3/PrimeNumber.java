import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number");
    int number = input.nextInt();

    // creating logic
    boolean isPrime = true;
    if (number <= 1)
      isPrime = false;
    else {
      for (int i = 2; i < number; i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
    }

    // displaying result
    System.out.println(isPrime ? "Prime Number" : "Not a Prime Number");

    // closing scanner class stream
    input.close();
  }
}