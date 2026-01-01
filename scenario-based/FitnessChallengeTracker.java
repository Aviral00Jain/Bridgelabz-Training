import java.util.Scanner;

public class FitnessChallengeTracker {
    /*      13. Sandeep’s Fitness Challenge Tracker 🏋️
            ♂Each day Sandeep completes a number of push-ups.
            ● Store counts for a week.
            ● Use for-each to calculate total and average.
            ● Use continue to skip rest days. */

    public static void main(String[] args) {

        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        int week =7; // 7 days
        String weekdays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int weekpushups[] = new int[7];

        for(int i=0;i<week;i++){
            if(i==2 || i==6){
                System.out.println("Rest day"); // wednesday and sunday
            }
            else {
                System.out.println("Enter push-ups count for "+ weekdays[i]);
                weekpushups[i] = sc.nextInt();
            }
        }

        // Calculating average pushups and total pushups
        int totalPushups = 0;
        for(int each : weekpushups) {
           totalPushups+=each;
        }

        System.out.println("Total push-ups : "+totalPushups);
        System.out.println("Average push-ups : " + totalPushups/5);
    }
}
