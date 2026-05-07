import java.util.Scanner;

public class MethodOverloadingCalculator {
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = input.nextInt();

        System.out.print("Enter third integer: ");
        int thirdInteger = input.nextInt();

        System.out.print("Enter first decimal number: ");
        double firstDecimal = input.nextDouble();

        System.out.print("Enter second decimal number: ");
        double secondDecimal = input.nextDouble();

        int twoIntegerSum = add(firstInteger, secondInteger);
        int threeIntegerSum = add(firstInteger, secondInteger, thirdInteger);
        double twoDecimalSum = add(firstDecimal, secondDecimal);

        System.out.println("Sum of two integers = " + twoIntegerSum);
        System.out.println("Sum of three integers = " + threeIntegerSum);
        System.out.println("Sum of two decimals = " + twoDecimalSum);
        input.close();
    }
}
