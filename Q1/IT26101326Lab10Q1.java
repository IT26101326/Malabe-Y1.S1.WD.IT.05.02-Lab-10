import java.util.Scanner;

public class IT26101326Lab10Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        // Part (a): assertion to check the mark range
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
        System.out.println("\nMark is Validated");

        // Part (b): determine the grade
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Assertion to verify the grade assigned
        assert (grade == 'A' && mark >= 75)
            || (grade == 'B' && mark >= 60 && mark <= 74)
            || (grade == 'C' && mark >= 50 && mark <= 59)
            || (grade == 'D' && mark >= 40 && mark <= 49)
            || (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        input.close();
    }
}