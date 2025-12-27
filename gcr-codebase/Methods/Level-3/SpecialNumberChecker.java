import java.util.Scanner;

class SpecialNumberChecker {

    //Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    //Method to store digits
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    //method to check Prime number
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //method to check Neon number
    public static boolean isNeon(int number) {

        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    //method to check Spy number
    public static boolean isSpy(int[] digits) {

        int sum = 0;
        int product = 1;

        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }

        return sum == product;
    }

    //method to check Automorphic number
    public static boolean isAutomorphic(int number) {

        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    //method to check Buzz number
    public static boolean isBuzz(int number) {

        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = getDigits(number);

        // display Prime check
        if (isPrime(number)) {
            System.out.println("number is a Prime number");
        } else {
            System.out.println("number is not a Prime number");
        }

        // display Neon check
        if (isNeon(number)) {
            System.out.println("number is a Neon number");
        } else {
            System.out.println("number is not a Neon number");
        }

        // display Spy check
        if (isSpy(digits)) {
            System.out.println("number is a Spy number");
        } else {
            System.out.println("number is not a Spy number");
        }

        if (isAutomorphic(number)) {
            System.out.println("number is an Automorphic number");
        } else {
            System.out.println("number is not an Automorphic number");
        }

        if (isBuzz(number)) {
            System.out.println("number is a Buzz number");
        } else {
            System.out.println("number is not a Buzz number");
        }
    }
}