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
