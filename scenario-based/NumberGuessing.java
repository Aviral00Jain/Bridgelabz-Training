import java.util.* ;

public class NumberGuessing {

public static void main (String [] args) {

   Scanner sc = new Scanner(System.in);
    int tries = 5 ;
    
   
    int randomnumber = (int)(Math.random() * 100) + 1;
    boolean  a = true ;

    do {

        //Taking input from user
        System.out.print("Enter your choice between 1 to 100 : ");
        int choice = sc.nextInt();


      if (randomnumber < choice){
           System.out.println ("Too high");
           tries-- ;
        }
      else if (randomnumber > choice){
           System.out.println("Too low");
           tries-- ;

      }
      else {
           System.out.println("Congratulations! , you have won the match");
           a = false ;
           break ;

    }
} 
      while(a ||  tries != 0);
          

}
}

           
   