import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter second string: ");
        String secondString = input.nextLine();

        boolean isEqual = firstString.equals(secondString);

        if (isEqual) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        input.close();
    }
}
