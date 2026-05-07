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
