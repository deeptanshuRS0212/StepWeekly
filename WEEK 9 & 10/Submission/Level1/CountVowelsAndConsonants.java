import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);

            boolean isAlphabet = character >= 'a' && character <= 'z';

            if (isAlphabet) {
                boolean isVowel = character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';

                if (isVowel) {
                    vowelCount = vowelCount + 1;
                } else {
                    consonantCount = consonantCount + 1;
                }
            }
        }

        System.out.println("Vowels = " + vowelCount);
        System.out.println("Consonants = " + consonantCount);
        input.close();
    }
}
