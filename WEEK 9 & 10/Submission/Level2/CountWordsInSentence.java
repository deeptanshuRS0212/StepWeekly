import java.util.Scanner;

public class CountWordsInSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        int wordCount;

        if (sentence.isEmpty()) {
            wordCount = 0;
        } else {
            String[] words = sentence.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Word count = " + wordCount);
        input.close();
    }
}
