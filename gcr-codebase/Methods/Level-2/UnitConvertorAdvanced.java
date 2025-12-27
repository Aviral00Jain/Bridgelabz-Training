import java.util.Scanner;

class UnitConvertorAdvanced {

    // Creating methods
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
	
	
	 public static void main(String [] args){
	
	// Scanner class object
	Scanner sc = new Scanner(System.in);
	
	//Taking input from user
	System.out.println("Enter number ");
	int n = sc.nextInt();

    // Calling methods and displaying result
	System.out.println("Number : " + n + " Fahrenheit to Celsius : " +convertFahrenheitToCelsius(n));
    System.out.println("Number : " + n + " Celsius to Fahrenheit : " +convertCelsiusToFahrenheit(n));
	System.out.println("Number : " + n + " pounds to kilograms  : " +convertPoundsToKilograms(n));
	System.out.println("Number : " + n + " Kilograms To Pounds : " +convertKilogramsToPounds(n));
	System.out.println("Number : " + n + " liters to gallons  : " +convertLitersToGallons(n));
	System.out.println("Number : " + n + " gallons to liters  : " +convertGallonsToLiters(n));

     }

}