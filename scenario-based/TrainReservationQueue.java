import java.util.Scanner;

public class TrainReservationQueue {
     /*     12. Train Reservation Queue 🚆
            Simulate a basic ticket booking system.
            ● Show menu with switch
            ● Allow multiple bookings using while-loop.
            ● Stop booking once seats reach zero (break).*/
    public static void main(String[] args) {

        // Creating scanner class object
        Scanner sc = new Scanner(System.in);

        // final values
        int totalSeat = 25;
        int available = 25;
        int booked = 0;

        System.out.println("Welcome to Train Reservation ");
        boolean program = true;
        while(program){
            System.out.println("press 1 for reservation.");
            System.out.println("Press 2 for available seats.");
            System.out.println("Press 3 for canceling.");
            System.out.println("Press 4 for booking again.");
            System.out.println("Press 0 for ending program.");
            int choice = sc.nextInt();

            switch (choice){
                case 1 ->{
                    System.out.println("Enter number of passenger");
                    int n = sc.nextInt();
                    if(available >= n) {
                        System.out.println("Reservation succesfull");
                        available -= n;
                        booked += n;
                    }
                    else{
                        System.out.println("Seats not available ");
                    }
                }
                case 2->{
                    System.out.println("Available seats : "+ available);
                }
                case 3 ->{
                    System.out.println("Enter number of passengers");
                    int m = sc.nextInt();
                    if(booked >= m) {
                        System.out.println("Reservation succesfull");
                        booked -= m;
                        available += m;
                    }
                    else {
                        System.out.println("Invalid entry");
                    }
                }
                case 0 ->{
                    System.out.println("Booked seats : " + booked);
                    System.out.println("Thankyou!!");
                    program = false;
                }
            }

        }

    }
}
