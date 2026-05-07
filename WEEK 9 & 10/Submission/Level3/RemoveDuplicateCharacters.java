import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String result = "";

        for (int index = 0; index < text.length(); index++) {
            char currentCharacter = text.charAt(index);

            boolean alreadyPresent = false;

            for (int resultIndex = 0; resultIndex < result.length(); resultIndex++) {
                if (result.charAt(resultIndex) == currentCharacter) {
                    alreadyPresent = true;
                    break;
                }
            }

            if (!alreadyPresent) {
                result = result + currentCharacter;
            }
        }

        System.out.println("String after removing duplicates: " + result);
        input.close();
    }
}
