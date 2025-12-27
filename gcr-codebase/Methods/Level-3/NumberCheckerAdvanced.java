import java.util.Scanner;

class NumberCheckerAdvanced {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static double findSumOfSquares(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = findSumOfDigits(digits);
        return number % sumOfDigits == 0;
    }

    // Method to find digit frequency using 2D array
    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count frequency
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get digits array
        int[] digits = getDigits(number);

        // Display digits
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        // Sum of digits
        int sum = findSumOfDigits(digits);
        System.out.println("\nSum of digits: " + sum);

        // Sum of squares of digits
        double squareSum = findSumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + squareSum);

        // Harshad number check
        if (isHarshadNumber(number, digits)) {
            System.out.println("The number is a Harshad Number");
        } else {
            System.out.println("The number is not a Harshad Number");
        }

        // Digit frequency
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] +
                        " occurs " + frequency[i][1] + " times");
            }
        }
    }
}