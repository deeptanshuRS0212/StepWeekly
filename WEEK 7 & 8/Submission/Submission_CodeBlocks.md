# Week 7 & 8 Java Practice Submission

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 7 & 8\Submission\Level1\MethodForAddition.java
```java
import java.util.Scanner;

public class MethodForAddition {
    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int result = addTwoNumbers(firstNumber, secondNumber);

        System.out.println("Sum = " + result);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 7 & 8\Submission\Level1\MethodForAreaOfCircle.java
```java
import java.util.Scanner;

public class MethodForAreaOfCircle {
    public static double calculateArea(double radius) {
        double pi = 3.14159;
        double area = pi * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double result = calculateArea(radius);

        System.out.println("Area of circle = " + result);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 7 & 8\Submission\Level1\MethodForEvenOdd.java
```java
import java.util.Scanner;

public class MethodForEvenOdd {
    public static boolean isEven(int number) {
        int remainder = number % 2;
        return remainder == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean evenCheck = isEven(number);

        if (evenCheck) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 7 & 8\Submission\Level1\MethodForMaximum.java
```java
import java.util.Scanner;

public class MethodForMaximum {
    public static int getMaximum(int firstNumber, int secondNumber, int thirdNumber) {
        int maximumNumber = firstNumber;

        if (secondNumber > maximumNumber) {
            maximumNumber = secondNumber;
        }

        if (thirdNumber > maximumNumber) {
            maximumNumber = thirdNumber;
        }

        return maximumNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        int result = getMaximum(firstNumber, secondNumber, thirdNumber);

        System.out.println("Maximum number = " + result);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 7 & 8\Submission\Level2\MethodForFactorial.java
```java
import java.util.Scanner;

public class MethodForFactorial {
    public static long factorial(int number) {
        long result = 1;

        for (int current = 1; current <= number; current++) {
            result = result * current;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        long result = factorial(number);

        System.out.println("Factorial = " + result);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 7 & 8\Submission\Level2\MethodForFibonacci.java
```java
import java.util.Scanner;

public class MethodForFibonacci {
    public static void printFibonacciSeries(int terms) {
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
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        printFibonacciSeries(terms);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 7 & 8\Submission\Level2\MethodForPrimeCheck.java
```java
import java.util.Scanner;

public class MethodForPrimeCheck {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean result = isPrime(number);

        if (result) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 7 & 8\Submission\Level3\MethodOverloadingCalculator.java
```java
import java.util.Scanner;

public class MethodOverloadingCalculator {
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = input.nextInt();

        System.out.print("Enter third integer: ");
        int thirdInteger = input.nextInt();

        System.out.print("Enter first decimal number: ");
        double firstDecimal = input.nextDouble();

        System.out.print("Enter second decimal number: ");
        double secondDecimal = input.nextDouble();

        int twoIntegerSum = add(firstInteger, secondInteger);
        int threeIntegerSum = add(firstInteger, secondInteger, thirdInteger);
        double twoDecimalSum = add(firstDecimal, secondDecimal);

        System.out.println("Sum of two integers = " + twoIntegerSum);
        System.out.println("Sum of three integers = " + threeIntegerSum);
        System.out.println("Sum of two decimals = " + twoDecimalSum);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 7 & 8\Submission\Level3\RecursiveFactorialMethod.java
```java
import java.util.Scanner;

public class RecursiveFactorialMethod {
    public static long factorialRecursive(int number) {
        if (number <= 1) {
            return 1;
        }

        return number * factorialRecursive(number - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        long result = factorialRecursive(number);

        System.out.println("Factorial (recursive) = " + result);
        input.close();
    }
}
```

