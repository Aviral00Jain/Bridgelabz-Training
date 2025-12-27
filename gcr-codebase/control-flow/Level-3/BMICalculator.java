import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {

    // creating object of scanner class
    Scanner input = new Scanner(System.in);

    // taking input from user
	System.out.println("Enter weight");
    double weight = input.nextDouble();
	System.out.println("Enter height");
    double heightCm = input.nextDouble();

       // creating logic
      double heightMeter = heightCm / 100;
       double bmi = weight / (heightMeter * heightMeter);
        String status;

    if (bmi <= 18.4) {
      status = "Underweight";
    } else if (bmi <= 24.9) {
      status = "normal";
    } 
	else if (bmi <= 39.9) {
      status = "overweight";
    } 
	else {
      status = "obese";
    }

          //displaying result
            System.out.println("BMI = " + bmi);
            System.out.println("Status = " + status);

    // closing scanner class stream
    input.close();
  }
}