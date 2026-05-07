import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principalAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRatePercent = input.nextDouble();

        System.out.print("Enter time in years: ");
        double timeInYears = input.nextDouble();

        double percentBase = 100.0;
        double simpleInterest = (principalAmount * annualRatePercent * timeInYears) / percentBase;
        double totalAmount = principalAmount + simpleInterest;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Total Amount = " + totalAmount);
        input.close();
    }
}
