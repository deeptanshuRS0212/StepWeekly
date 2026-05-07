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
