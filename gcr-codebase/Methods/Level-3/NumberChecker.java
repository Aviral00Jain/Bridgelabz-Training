import java.util.Scanner;

class NumberChecker {

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
	
	public static void main(String[] args){
	
	  //Create scanner object
	   Scanner sc = new Scanner(System.in);
	   
	   //Taking input from user
	   System.out.println("Enter a number");
	   int n = sc.nextInt();
	   
	   int smallest[] = findSmallestAndSecondSmallest(getDigits(n));
	   int largest[] = findLargestAndSecondLargest(getDigits(n));
	   
	   
	   	System.out.println("number of digits : "+ countDigits(n));
	   	System.out.println("number is duck number : "+ isDuckNumber(getDigits(n)));
		System.out.println("number is Armstrong Number : "+ isArmstrongNumber(n, getDigits(n)));
	   	System.out.println("Smallest : "+ smallest[0] +" and second smallest number : "+ smallest[1]);
	   	System.out.println("largest number : "+ largest[0] +" and second largest : "+largest[1] );
    }
}