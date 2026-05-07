# Week 5 & 6 Java Practice Submission

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 5 & 6\Submission\Level1\ArrayAverageCalculator.java
```java
import java.util.Scanner;

public class ArrayAverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        double[] numbers = new double[size];
        double sum = 0.0;

        for (int index = 0; index < size; index++) {
            System.out.print("Enter value " + (index + 1) + ": ");
            numbers[index] = input.nextDouble();
            sum = sum + numbers[index];
        }

        double average = sum / size;

        System.out.println("Average = " + average);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 5 & 6\Submission\Level1\ArraySumCalculator.java
```java
import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
            sum = sum + numbers[index];
        }

        System.out.println("Sum of array elements = " + sum);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 5 & 6\Submission\Level1\LargestElementInArray.java
```java
import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }

        int largest = numbers[0];

        for (int index = 1; index < size; index++) {
            if (numbers[index] > largest) {
                largest = numbers[index];
            }
        }

        System.out.println("Largest element = " + largest);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 5 & 6\Submission\Level1\SmallestElementInArray.java
```java
import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }

        int smallest = numbers[0];

        for (int index = 1; index < size; index++) {
            if (numbers[index] < smallest) {
                smallest = numbers[index];
            }
        }

        System.out.println("Smallest element = " + smallest);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 5 & 6\Submission\Level2\CountEvenOddInArray.java
```java
import java.util.Scanner;

public class CountEvenOddInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int evenCount = 0;
        int oddCount = 0;

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            numbers[index] = input.nextInt();

            if (numbers[index] % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
        }

        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 5 & 6\Submission\Level2\ReverseArrayElements.java
```java
import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }

        System.out.print("Reversed array: ");

        for (int index = size - 1; index >= 0; index--) {
            System.out.print(numbers[index] + " ");
        }

        System.out.println();
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 5 & 6\Submission\Level2\SearchElementInArray.java
```java
import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = input.nextInt();

        int foundIndex = -1;

        for (int index = 0; index < size; index++) {
            if (numbers[index] == target) {
                foundIndex = index;
                break;
            }
        }

        if (foundIndex >= 0) {
            System.out.println("Element found at index " + foundIndex);
        } else {
            System.out.println("Element not found");
        }

        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 5 & 6\Submission\Level3\SecondLargestInArray.java
```java
import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int index = 0; index < size; index++) {
            int current = numbers[index];

            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element not available");
        } else {
            System.out.println("Second largest element = " + secondLargest);
        }

        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\StepWeekly\WEEK 5 & 6\Submission\Level3\SortArrayAscending.java
```java
import java.util.Scanner;

public class SortArrayAscending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int index = 0; index < size; index++) {
            System.out.print(numbers[index] + " ");
        }

        System.out.println();
        input.close();
    }
}
```

