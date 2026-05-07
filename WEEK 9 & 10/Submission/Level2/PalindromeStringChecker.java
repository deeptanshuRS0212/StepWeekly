import java.util.Scanner;

public class PalindromeStringChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String normalizedText = text.toLowerCase();
        String reversedText = "";

        for (int index = normalizedText.length() - 1; index >= 0; index--) {
            reversedText = reversedText + normalizedText.charAt(index);
        }

        boolean isPalindrome = normalizedText.equals(reversedText);

        if (isPalindrome) {
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not a palindrome string");
        }

        input.close();
    }
}
