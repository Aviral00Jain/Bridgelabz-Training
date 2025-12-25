import java.util.Scanner;

public class TemperatureConverter {

    // fahrenheit to celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // celsius to fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        //creating scanner class object
        Scanner sc = new Scanner(System.in);

        // taking user input
		System.out.println("Enter temp");
        double temperature = sc.nextDouble();
		System.out.println("enter choice");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println(fahrenheitToCelsius(temperature));
        } else if (choice == 2) {
            System.out.println(celsiusToFahrenheit(temperature));
        }
    }
}
