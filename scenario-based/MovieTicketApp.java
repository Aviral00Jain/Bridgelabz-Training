import java.util.Scanner;

public class MovieTicketApp {

 /*         14. Movie Ticket Booking App 🎬
            Ask users for movie type, seat type (gold/silver), and snacks.
            ● Use switch and if together.
            ● Loop through multiple customers.
            ● Clean structure and helpful variable names. */

    public static void main(String[] args) {

        // Creating scanner class object
        Scanner sc = new Scanner(System.in);

        boolean customer = true;
        int preference = 0;
        int seatOption = 0;

        // While loop to continously run app until user quits
        while (customer) {
            System.out.println("----Movies screeing----");
            System.out.println("Dhurandar -> Press 1");
            System.out.println("Tere Ishk Mein -> Press 2");
            System.out.println("Avatar: Fire and Ash -> Press 3");
            System.out.println("Zootopia 2 -> Press 4");
            System.out.println("Press 0 to Quit.");
            preference = sc.nextInt();

            // switch statement for user choice
            switch (preference) {
                case 1 ->{
                    System.out.println("Selected movie Dhurander");
                    System.out.println("Seats Available");
                    System.out.println(" Gold - 250rs  -> Press 1 ");
                    System.out.println("Silver - 200rs --> Press 2");
                    System.out.println("Standard - 150rs  -->Press 3");
                    seatOption = sc.nextInt();

                    // if-else statement for seat prefrence
                    if (seatOption == 1) System.out.println("Ticket Booked for movie Dhunrander \n Gold Price - 250rs");
                    else if (seatOption == 2) System.out.println("Ticket Booked for movie Dhunrander \n Silver \n Price - 200rs");
                    else System.out.println("Ticket Booked for movie Dhunrander \n Standard \n Price - 150rs");
                }
                case 2 ->{
                    System.out.println("Selected movie Tere Ishk Mein");
                    System.out.println("Seats Available");
                    System.out.println(" Gold - 250rs  -> Press 1 ");
                    System.out.println("Silver - 200rs --> Press 2");
                    System.out.println("Standard - 150rs  -->Press 3");
                    seatOption = sc.nextInt();
                    if (seatOption == 1) System.out.println("Ticket Booked for movie Tere Ishk Mein \n Gold Price - 250rs");
                    else if (seatOption == 2) System.out.println("Ticket Booked for movie Tere Ishk Mein \n Silver \n Price - 200rs");
                    else System.out.println("Ticket Booked for movie Tere Ishk Mein \n Standard \n Price - 150rs");
                }
                case 3 ->{
                    System.out.println("Selected movie Avatar: Fire and Ash");
                    System.out.println("Seats Available");
                    System.out.println(" Gold - 250rs  -> Press 1 ");
                    System.out.println("Silver - 200rs --> Press 2");
                    System.out.println("Standard - 150rs  -->Press 3");
                    seatOption = sc.nextInt();
                    if (seatOption == 1) System.out.println("Ticket Booked for movie Avatar: Fire and Ash \nGold \nPrice - 250rs");
                    else if (seatOption == 2) System.out.println("Ticket Booked for movie Avatar: Fire and Ash \nSilver \n Price - 200rs");
                    else System.out.println("Ticket Booked for movie Avatar: Fire and Ash \nStandard \nPrice - 150rs");
                }
                case 4 ->{
                    System.out.println("Selected movie Zootopia 2");
                    System.out.println("Seats Available");
                    System.out.println(" Gold - 250rs  -> Press 1 ");
                    System.out.println("Silver - 200rs --> Press 2");
                    System.out.println("Standard - 150rs  -->Press 3");
                    seatOption = sc.nextInt();
                    if (seatOption == 1) System.out.println("Ticket Booked for movie Zootopia 2 \n Gold Price - 250rs");
                    else if (seatOption == 2) System.out.println("Ticket Booked for movie Zootopia 2 \n Silver \n Price - 200rs");
                    else System.out.println("Ticket Booked for movie Zootopia 2 \n Standard \n Price - 150rs");
                }
                case 0 ->{
                    System.out.println("Movie ticket booked succesfully");
                    customer = false;
                }

            }

        }
    }
}

