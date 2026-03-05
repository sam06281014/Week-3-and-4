//largest among three numbers

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        // Checking largest using if-else if
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Largest number is: " + number1);
        } 
        else if (number2 >= number1 && number2 >= number3) {
            System.out.println("Largest number is: " + number2);
        } 
        else {
            System.out.println("Largest number is: " + number3);
        }

        input.close();
    }
}