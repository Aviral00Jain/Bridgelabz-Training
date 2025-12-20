import java.util.Scanner;

public class SimpleInterest {

       public static int getsimpleinterest(int p , int r ,int t) {
           return (p*r*t) / 100;
       }


       public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

       
       System.out.println("Enter Principal");
       int Principal = sc.nextInt();

       System.out.println("Enter Rate");
       int Rate = sc.nextInt();

       System.out.println("Enter Time");
       int Time = sc.nextInt();


       int SimpleInterest = getsimpleinterest(Principal , Rate ,Time);

       System.out.println("The Simple Interest is " + SimpleInterest + " for Principal " + Principal +  " Rate of Interest " + Rate +" and Time " + Time);
 

       }

       }
