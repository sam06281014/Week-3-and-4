// Program Name: SimpleCalculator
// Description: Performs basic arithmetic operations

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1, number2, result;
        char operator;

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }

        input.close();
    }
}