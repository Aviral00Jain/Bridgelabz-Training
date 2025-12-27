import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter number");
    int number = input.nextInt();

    // creating logic
    int count = 0;
    while (number != 0) {
      number = number / 10;
      count++;
    }

    // displaying result
    System.out.println("Number of digits = " + count);

        //closing scanner class stream
        input.close();
  }
}