import java.util.Scanner;

public class MethodForAddition {
    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int result = addTwoNumbers(firstNumber, secondNumber);

        System.out.println("Sum = " + result);
        input.close();
    }
}
