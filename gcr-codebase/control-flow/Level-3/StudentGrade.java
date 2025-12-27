import java.util.Scanner;

public class StudentGrade {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter marks in physics");
    int physics = input.nextInt();
	System.out.println("Enter marks in chemistry");
    int chemistry = input.nextInt();
		System.out.println("Enter marks in maths");
    int maths = input.nextInt();

    // creating logic
    double percentage = (physics + chemistry + maths) / 3.0;
    char grade;
    String remarks;

    if (percentage >= 80) {
      grade = 'A';
      remarks = "Level 4, above agency-normalized standards";
    } else if (percentage >= 70) {
      grade = 'B';
      remarks = "Level 3, at agency-normalized standards";
    } else if (percentage >= 60) {
      grade = 'C';
      remarks = "Level 2, below but approaching agency-normalized standards";
    } else if (percentage >= 50) {
      grade = 'D';
      remarks = "Level 1, well below agency-normalized standards";
    } else if (percentage >= 40) {
      grade = 'E';
      remarks = "Level 1-, too below agency-normalized standards";
    } else {
      grade = 'R';
      remarks = "Remedial standards";
    }

    // displaying result
    System.out.println("Average Mark = " + percentage);
    System.out.println("Grade = " + grade);
    System.out.println("Remarks = " + remarks);

    // closing scanner class stream
    input.close();
  }
}