import java.util.Scanner;

public class NumberOfHandshakes {

   // Creating method
   public static int getnumberofhandshakes( int n) {

      return (n * (n - 1)) / 2;
   
      }

   public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

  //Taking user input
  System.out.println("Enter  no. of students:");
   int student = sc.nextInt();

   //call method
   int NumberOfHandshakes = getnumberofhandshakes(student);

   System.out.println("THe total number of handshake is:" +  NumberOfHandshakes);

   }


   }