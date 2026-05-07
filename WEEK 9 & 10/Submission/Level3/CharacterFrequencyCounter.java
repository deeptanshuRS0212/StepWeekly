import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.print("Enter character to count: ");
        char targetCharacter = input.nextLine().charAt(0);

        int frequency = 0;

        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == targetCharacter) {
                frequency = frequency + 1;
            }
        }

        System.out.println("Frequency of '" + targetCharacter + "' = " + frequency);
        input.close();
    }
}
