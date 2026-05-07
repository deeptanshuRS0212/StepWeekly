import java.util.Scanner;

public class FibonacciSeriesGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci series: ");

        for (int count = 1; count <= terms; count++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
        input.close();
    }
}
