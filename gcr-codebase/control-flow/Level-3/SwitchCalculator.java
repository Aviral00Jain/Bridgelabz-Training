import java.util.Scanner;

public class SwitchCalculator {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

       // taking input from user
     	System.out.println("Enter number 1");
       double first = input.nextDouble();
	   System.out.println("Enter number 2");
       double second = input.nextDouble();
	   System.out.println("Enter operation type");
       String op = input.next();

    // creating logic
    switch (op) {
      case "+":
        System.out.println(first+second);
        break;
      case "-":
        System.out.println(first- second);
        break;
      case "*":
        System.out.println(first*second);
        break;
      case "/":
        System.out.println(first/ second);
        break;
      default:
        System.out.println("Invalid Operator");
    }

    // closing scanner class stream
    input.close();
  }
}