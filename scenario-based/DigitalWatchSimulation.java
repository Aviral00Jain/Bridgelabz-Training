public class DigitalWatchSimulation {

   public static void main (String [] args) {

   int hours = 24;
   int minutes = 60 ;

   for (int i= 0 ; i <= hours ; i++){
        if (i == 13) {

              break ;
           }


        for (int j = 0 ; j < minutes ; j++){

           System.out.println (i + ":" + j);
           if (i == 12 && j == 59) {
              System.out.println ("Simulate Power Cut ");

           }
           else if (i == 13) {

               break;
             
           }

        }

     }

  }

}