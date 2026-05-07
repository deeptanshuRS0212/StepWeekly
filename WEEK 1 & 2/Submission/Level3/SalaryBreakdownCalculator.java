import java.util.Scanner;

public class SalaryBreakdownCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        double hraRate = 0.20;
        double daRate = 0.10;
        double taxRate = 0.08;

        double hraAmount = basicSalary * hraRate;
        double daAmount = basicSalary * daRate;
        double grossSalary = basicSalary + hraAmount + daAmount;
        double taxAmount = grossSalary * taxRate;
        double netSalary = grossSalary - taxAmount;

        System.out.println("Gross Salary = " + grossSalary);
        System.out.println("Tax Amount = " + taxAmount);
        System.out.println("Net Salary = " + netSalary);
        input.close();
    }
}
