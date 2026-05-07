import java.util.Scanner;

public class OperatorPrecedenceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        double expressionWithoutParentheses = a + b * c;
        double expressionWithParentheses = (a + b) * c;

        System.out.println("a + b * c = " + expressionWithoutParentheses);
        System.out.println("(a + b) * c = " + expressionWithParentheses);
        input.close();
    }
}
