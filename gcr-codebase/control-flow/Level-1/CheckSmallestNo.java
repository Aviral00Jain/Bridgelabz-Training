import java.util.Scanner;

public class CheckSmallestNo{
      

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

   //get multiple input from the user

   System.out.println("enter the number1");
        int number1 = input.nextInt();

   System.out.println("enter the number2");
        int number2 = input.nextInt();

   System.out.println("enter the number3");
        int number3 = input.nextInt();
   

   //to check the smallest no. among 3 numbers

   if (number1 < number2 && number1 < number3) {
        System.out.println(" Is the first number the smallest? " + true);
   } 

   else {
        System.out.println(" Is the first number the smallest? " + false);
   }
  
}
}