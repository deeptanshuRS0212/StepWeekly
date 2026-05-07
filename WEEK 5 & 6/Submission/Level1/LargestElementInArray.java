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
