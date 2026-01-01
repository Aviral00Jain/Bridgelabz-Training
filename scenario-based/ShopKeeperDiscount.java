import java.util.* ;

public class ShopKeeperDiscount {

public static void main (String [] args){

    Scanner sc = new Scanner(System.in);
    int Totalprice = 0 ;
    System.out.print("Enter no. of Items:");
    int items = sc.nextInt();
    System.out.println("--------5% off on  500 or more------------");
    System.out.println("");
    System.out.println("--------10% off on 1000 or more-----------");
    System.out.println("");
    System.out.println("--------10% off on 5000 or more and get the 30% off on your next order------------");

    for (int i=1 ;   i<= items ; i++) {

       System.out.print("Enter the price of item" + i + ":");

       int price = sc.nextInt();

      if (price > 0){

       Totalprice = Totalprice + price ;

     }

}
 while (true){
 if (Totalprice >= 500 && Totalprice < 1000){

     System.out.println ("As your order amount is more than 500. you get the discount of 5% on total bill");
     System.out.println("You have to pay the amount :" + (Totalprice-(Totalprice * 5)/100));
     break;
}

else if (Totalprice >= 1000 && Totalprice > 5000) {

     System.out.println ("As your order amount is more than 1000. you get the discount of 10% on total bill");
     System.out.println ("You have to Pay the amount :" + (Totalprice-(Totalprice * 10)/100));
     break;
}

else if (Totalprice >= 5000) {

      System.out.println ("As your order amount is more than 5000. you get the discount of 10% on your total bill additionally you get the 30% off voucher for your next order");
      System.out.println( "You have to pay the amount :" + (Totalprice-(Totalprice * 10)/100));
      break;
}
}
}
}
