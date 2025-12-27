import java.util.Scanner;

public class CheckPositive {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          int[] number = new int[5];
         
      
          for (int i=0 ; i < number.length ; i++) {
             System.out.print ("Enter the no." + (i+1) + ":");
             number[i] = input.nextInt();
       
           }
          System.out.println();

         //Check weather number is positive or not
          for (int i=0 ; i<number.length ; i++) {

               // Check weather number is even or odd
               if (number[i] > 0) {
                    if (number[i] % 2 == 0) {
                         System.out.println(number[i] + "is even");
                    }

                    else {
                          System.out.println (number[i] + "is odd");
                    }

                    }
               else if (number[i] < 0) {
                       System.out.println (number[i] + "is negative");
                    
                    }

                else {
                       System.out.println (number[i] + "is Zero");
                 
                    }
                    }

           // Compare the First and last element
           if (number[0] == number[4]) {
              System.out.println (" These numbers are equal");
             
             }

           else if (number[0] > number[4]) {
               System.out.println (" first element is greater than last element ");

             }

          else {
                System.out.println (" Last element is greater than first element");

            }

        }

        }
           
                