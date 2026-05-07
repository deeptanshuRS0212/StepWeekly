import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Enter third number: ");
        double thirdNumber = input.nextDouble();

        double largestNumber;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largestNumber = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largestNumber = secondNumber;
        } else {
            largestNumber = thirdNumber;
        }

        System.out.println("Largest number = " + largestNumber);
        input.close();
    }
}
