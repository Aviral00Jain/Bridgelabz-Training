import java.util.Scanner;

class CheckNoDivisibility{

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);


     // get number from the user
      System.out.println("Enter the no.");
      int Number = input.nextInt();


    //  Is no. divisible by 5 or not

    if ( Number % 5 ==0){
            System.out.println(" Is the number "+ Number + " divisible by 5? " + true);
    }
    else {

           System.out.println(" Is the number "+ Number + " divisible by 5? " + false);
    }

    input.close();
}
}