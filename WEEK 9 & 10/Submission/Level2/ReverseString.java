import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String reversedText = "";

        for (int index = text.length() - 1; index >= 0; index--) {
            reversedText = reversedText + text.charAt(index);
        }

        System.out.println("Reversed string: " + reversedText);
        input.close();
    }
}
