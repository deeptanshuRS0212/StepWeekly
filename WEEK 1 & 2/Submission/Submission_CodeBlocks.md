# Week 1 & 2 Java Practice Submission

## C:\Users\deept\OneDrive\Desktop\Step Assignments\WEEK 1 & 2\Submission\Level1\AreaOfCircle.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\WEEK 1 & 2\Submission\Level1\PerimeterOfRectangle.java
```java
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter of rectangle = " + perimeter);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\WEEK 1 & 2\Submission\Level1\SimpleInterestCalculator.java
```java
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principalAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRatePercent = input.nextDouble();

        System.out.print("Enter time in years: ");
        double timeInYears = input.nextDouble();

        double percentBase = 100.0;
        double simpleInterest = (principalAmount * annualRatePercent * timeInYears) / percentBase;
        double totalAmount = principalAmount + simpleInterest;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Total Amount = " + totalAmount);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\WEEK 1 & 2\Submission\Level1\TemperatureConverter.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\WEEK 1 & 2\Submission\Level2\DistanceConverter.java
```java
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double distanceInKilometers = input.nextDouble();

        double metersPerKilometer = 1000.0;
        double centimetersPerMeter = 100.0;

        double distanceInMeters = distanceInKilometers * metersPerKilometer;
        double distanceInCentimeters = distanceInMeters * centimetersPerMeter;

        System.out.println("Distance in meters = " + distanceInMeters);
        System.out.println("Distance in centimeters = " + distanceInCentimeters);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\WEEK 1 & 2\Submission\Level2\TotalMarksAndPercentage.java
```java
import java.util.Scanner;

public class TotalMarksAndPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        double subjectOneMarks = input.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double subjectTwoMarks = input.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double subjectThreeMarks = input.nextDouble();

        System.out.print("Enter marks of subject 4: ");
        double subjectFourMarks = input.nextDouble();

        System.out.print("Enter marks of subject 5: ");
        double subjectFiveMarks = input.nextDouble();

        double totalMarks = subjectOneMarks + subjectTwoMarks + subjectThreeMarks + subjectFourMarks + subjectFiveMarks;
        double maximumMarks = 500.0;
        double percentage = (totalMarks / maximumMarks) * 100.0;

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage);
        input.close();
    }
}
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\WEEK 1 & 2\Submission\Level2\TypeConversionDemo.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\WEEK 1 & 2\Submission\Level3\OperatorPrecedenceCalculator.java
```java
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
```

## C:\Users\deept\OneDrive\Desktop\Step Assignments\WEEK 1 & 2\Submission\Level3\SalaryBreakdownCalculator.java
```java
import java.util.Scanner;

public class SalaryBreakdownCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        double hraRate = 0.20;
        double daRate = 0.10;
        double taxRate = 0.08;

        double hraAmount = basicSalary * hraRate;
        double daAmount = basicSalary * daRate;
        double grossSalary = basicSalary + hraAmount + daAmount;
        double taxAmount = grossSalary * taxRate;
        double netSalary = grossSalary - taxAmount;

        System.out.println("Gross Salary = " + grossSalary);
        System.out.println("Tax Amount = " + taxAmount);
        System.out.println("Net Salary = " + netSalary);
        input.close();
    }
}
```

