import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;

        boolean isLeapYear = (divisibleBy4 && !divisibleBy100) || divisibleBy400;

        if (isLeapYear) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        input.close();
    }
}
