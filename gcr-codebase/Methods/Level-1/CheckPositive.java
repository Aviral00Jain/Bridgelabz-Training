import java.util.Scanner;

public class CheckPositive {

//Creating method
public static int getcheckpositive(int n){

    if ( n > 0) {
         return 1;
       
    }

    else if ( n < 0) {
           return -1 ;
     
    }

    else {
         return 0 ;

     }
     }

     public static void main (String [] args){
          Scanner sc = new Scanner(System.in);

     //Take user input
     System.out.println("enter the number:");
         int number = sc.nextInt();

     // Call methods
     int checkpositive = getcheckpositive(number);

     System.out.println(checkpositive);

     }
     }
 