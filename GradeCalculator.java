//GradeCalculator
// Description: Assigns grade based on marks

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int marks;

        System.out.print("Enter your marks: ");
        marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 50) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Grade: Fail");
        }

        input.close();
    }
}