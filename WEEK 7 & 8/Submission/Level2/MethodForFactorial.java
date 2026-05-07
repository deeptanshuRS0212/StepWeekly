import java.util.Scanner;

public class MethodForFactorial {
    public static long factorial(int number) {
        long result = 1;

        for (int current = 1; current <= number; current++) {
            result = result * current;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        long result = factorial(number);

        System.out.println("Factorial = " + result);
        input.close();
    }
}
