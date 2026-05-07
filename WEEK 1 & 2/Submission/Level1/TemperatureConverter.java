import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double conversionFactor = 9.0 / 5.0;
        double freezingPointOffset = 32.0;
        double fahrenheit = (celsius * conversionFactor) + freezingPointOffset;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
        input.close();
    }
}
