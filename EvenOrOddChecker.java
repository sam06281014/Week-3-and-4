// EvenOrOddChecker
import java.util.Scanner;

public class EvenOrOddChecker {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declaring variable for number
        int number;

        // Taking user input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean expression to check even
        boolean isEven = (number % 2 == 0);

        // Conditional statement
        if (isEven) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        input.close();
    }
}