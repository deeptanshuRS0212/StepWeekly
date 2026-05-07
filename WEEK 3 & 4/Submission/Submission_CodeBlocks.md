# Week 3 & 4 Java Practice Submission

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 3 & 4\Submission\Level1\EvenOddChecker.java
```java
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int remainder = number % 2;

        if (remainder == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 3 & 4\Submission\Level1\LargestOfThreeNumbers.java
```java
import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Enter third number: ");
        double thirdNumber = input.nextDouble();

        double largestNumber;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largestNumber = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largestNumber = secondNumber;
        } else {
            largestNumber = thirdNumber;
        }

        System.out.println("Largest number = " + largestNumber);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 3 & 4\Submission\Level1\LeapYearChecker.java
```java
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;

        boolean isLeapYear = (divisibleBy4 && !divisibleBy100) || divisibleBy400;

        if (isLeapYear) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 3 & 4\Submission\Level1\VowelOrConsonant.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 3 & 4\Submission\Level2\FactorialCalculator.java
```java
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        long factorial = 1;

        for (int current = 1; current <= number; current++) {
            factorial = factorial * current;
        }

        System.out.println("Factorial = " + factorial);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 3 & 4\Submission\Level2\MultiplicationTable.java
```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number for multiplication table: ");
        int number = input.nextInt();

        int startMultiplier = 1;
        int endMultiplier = 10;

        for (int multiplier = startMultiplier; multiplier <= endMultiplier; multiplier++) {
            int result = number * multiplier;
            System.out.println(number + " x " + multiplier + " = " + result);
        }

        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 3 & 4\Submission\Level2\SumOfNaturalNumbers.java
```java
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = input.nextInt();

        int sum = 0;

        for (int current = 1; current <= n; current++) {
            sum = sum + current;
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 3 & 4\Submission\Level3\FibonacciSeriesGenerator.java
```java
import java.util.Scanner;

public class FibonacciSeriesGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci series: ");

        for (int count = 1; count <= terms; count++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 3 & 4\Submission\Level3\PrimeNumberChecker.java
```java
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer greater than 1: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        input.close();
    }
}
```

