import java.util.Scanner;

public class BusAttendanceSystem {

      /*     9. School Bus Attendance System 🚍
             Track 10 students' presence.
            ● Use for-each loop on names.
            ● Ask "Present or Absent?"
            ● Print total present and absent counts. */

    public static void main(String[] args) {

        //Scanner class object
        Scanner sc = new Scanner(System.in);

        //student name array
        String studentNames[] = {"Ayush", "Aviral", "Aditya", "Shubham", "Anuj",
                                 "Vikash", "Kutte", "Vishal", "Rakesh", "Rohan"};
        int attendanceArray[] = new int[10];

        int totalAbsent = 0;
        int totalPresent =0;
        System.out.println("Enter 1 for present, 0 for absent.");
        for(int i = 0 ; i < studentNames.length; i++){
            System.out.println(studentNames[i] +" Present or Absent ?");
            attendanceArray[i] = sc.nextInt();
            if(attendanceArray[i]==0)totalAbsent++;
            else totalPresent++;
        }
        System.out.println("Total student present = "+totalPresent);
        System.out.println("Total student absent = "+ totalAbsent);

    }
}
