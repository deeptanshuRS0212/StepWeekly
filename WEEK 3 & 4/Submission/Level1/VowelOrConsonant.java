import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char character = input.next().toLowerCase().charAt(0);

        boolean isVowel = character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';

        if (isVowel) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

        input.close();
    }
}
