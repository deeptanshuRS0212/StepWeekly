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
