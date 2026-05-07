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
