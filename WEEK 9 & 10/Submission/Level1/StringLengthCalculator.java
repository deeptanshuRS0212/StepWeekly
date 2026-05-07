import java.util.Scanner;

public class StringLengthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int textLength = text.length();

        System.out.println("Length of string = " + textLength);
        input.close();
    }
}
