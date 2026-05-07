import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number for multiplication table: ");
        int number = input.nextInt();

        int startMultiplier = 1;
        int endMultiplier = 10;

        for (int multiplier = startMultiplier; multiplier <= endMultiplier; multiplier++) {
            int result = number * multiplier;
            System.out.println(number + " x " + multiplier + " = " + result);
        }

        input.close();
    }
}
