import java.util.Scanner;

public class RecursiveFactorialMethod {
    public static long factorialRecursive(int number) {
        if (number <= 1) {
            return 1;
        }

        return number * factorialRecursive(number - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        long result = factorialRecursive(number);

        System.out.println("Factorial (recursive) = " + result);
        input.close();
    }
}
