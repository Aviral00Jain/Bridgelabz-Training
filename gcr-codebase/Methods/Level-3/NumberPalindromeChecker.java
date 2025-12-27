import java.util.Scanner;

class NumberPalindromeChecker {

    //method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    //method to store digits in array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    //method to reverse digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    //method to compare two arrays
    public static boolean compareArrays(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    //method to check palindrome using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    //method to check Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Store digits
        int[] digits = getDigits(number);

        //Display digits
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        //reverse digits
        int[] reversed = reverseDigits(digits);
        System.out.print("\nReversed Digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }

        //palindrome check
        if (isPalindrome(digits)) {
            System.out.println("\nThe number is a Palindrome");
        } else {
            System.out.println("\nThe number is not a Palindrome");
        }

        //Duck number check
        if (isDuckNumber(digits)) {
            System.out.println("The number is a Duck Number");
        } else {
            System.out.println("The number is not a Duck Number");
        }
    }
}