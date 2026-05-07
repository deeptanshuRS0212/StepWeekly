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
