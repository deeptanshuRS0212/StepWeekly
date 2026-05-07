import java.util.Scanner;

public class TypeConversionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int integerValue = input.nextInt();

        double widenedValue = integerValue;
        float floatDivisor = 3.0f;
        float floatResult = integerValue / floatDivisor;
        int narrowedValue = (int) floatResult;

        System.out.println("Widened to double = " + widenedValue);
        System.out.println("Float division result = " + floatResult);
        System.out.println("Narrowed back to int = " + narrowedValue);
        input.close();
    }
}
