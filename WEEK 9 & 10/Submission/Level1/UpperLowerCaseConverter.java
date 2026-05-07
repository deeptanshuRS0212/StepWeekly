import java.util.Scanner;

public class UpperLowerCaseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String upperCaseText = text.toUpperCase();
        String lowerCaseText = text.toLowerCase();

        System.out.println("Uppercase: " + upperCaseText);
        System.out.println("Lowercase: " + lowerCaseText);
        input.close();
    }
}
