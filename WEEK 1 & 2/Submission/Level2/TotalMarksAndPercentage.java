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
