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
