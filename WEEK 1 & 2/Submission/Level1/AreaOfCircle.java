import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double area = pi * radius * radius;

        System.out.println("Area of circle = " + area);
        input.close();
    }
}
