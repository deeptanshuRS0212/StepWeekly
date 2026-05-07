import java.util.Scanner;

public class MethodForMaximum {
    public static int getMaximum(int firstNumber, int secondNumber, int thirdNumber) {
        int maximumNumber = firstNumber;

        if (secondNumber > maximumNumber) {
            maximumNumber = secondNumber;
        }

        if (thirdNumber > maximumNumber) {
            maximumNumber = thirdNumber;
        }

        return maximumNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        int result = getMaximum(firstNumber, secondNumber, thirdNumber);

        System.out.println("Maximum number = " + result);
        input.close();
    }
}
