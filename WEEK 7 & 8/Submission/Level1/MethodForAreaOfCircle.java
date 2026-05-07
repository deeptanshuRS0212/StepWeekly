import java.util.Scanner;

public class MethodForAreaOfCircle {
    public static double calculateArea(double radius) {
        double pi = 3.14159;
        double area = pi * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double result = calculateArea(radius);

        System.out.println("Area of circle = " + result);
        input.close();
    }
}
