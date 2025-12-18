import java.util.Scanner;

class CheckNoDivisibility{

     public static void main(string[] args) {
         Scanner input = new Scanner(system.in);


     // get number from the user
      system.out.println("Enter the no.");
      int Number = input.nextInt();


    //  Is no. divisible by 5 or not
    if ( Number % 5 ==0){
            system.out.println(" Is the number "+ Number + " divisible by 5? " + true);
    }
    else {
           system.out.println(" Is the number "+ Number + " divisible by 5? " + false);
    }
    input.close();
}
}