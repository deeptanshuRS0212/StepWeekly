import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        long factorial = 1;

        for (int current = 1; current <= number; current++) {
            factorial = factorial * current;
        }

        System.out.println("Factorial = " + factorial);
        input.close();
    }
}
