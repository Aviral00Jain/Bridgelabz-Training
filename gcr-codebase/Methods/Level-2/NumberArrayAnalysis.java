import java.util.Scanner;

class NumberArrayAnalysis {

    // Create method to check positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    // Create method to check Even odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
	
    // Create method to compare last and first digit
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }

    public static void main(String[] args) {

        // create scanner object
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
         
		// Display result 
        if (result == 1) {
            System.out.println("First element is greater than last");
        } else if (result == -1) {
            System.out.println("First element is less than last");
        } else {
            System.out.println("First and last elements are equal");
        }
    }
}