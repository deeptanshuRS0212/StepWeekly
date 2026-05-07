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
