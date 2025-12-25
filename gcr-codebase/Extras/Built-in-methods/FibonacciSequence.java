import java.util.Scanner;

public class FibonacciSequence {

    // method to generate fibonacci sequence
    public static void generateFibonacci(int terms) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from user
        int terms = sc.nextInt();

        // generating fibonacci
        generateFibonacci(terms);
    }
}
