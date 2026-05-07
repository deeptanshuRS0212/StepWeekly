# Week 9 & 10 Java Practice Submission

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 9 & 10\Submission\Level1\CountVowelsAndConsonants.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 9 & 10\Submission\Level1\StringComparison.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 9 & 10\Submission\Level1\StringLengthCalculator.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 9 & 10\Submission\Level1\UpperLowerCaseConverter.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 9 & 10\Submission\Level2\CountWordsInSentence.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 9 & 10\Submission\Level2\PalindromeStringChecker.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 9 & 10\Submission\Level2\ReverseString.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 9 & 10\Submission\Level3\CharacterFrequencyCounter.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 9 & 10\Submission\Level3\RemoveDuplicateCharacters.java
```java
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
```

