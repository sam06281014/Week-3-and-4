// Program Name: PrimeNumberChecker
// Description: Checks whether a number is prime

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number <= 1) {
            isPrime = false;
        } 
        else {
            for (int i = 2; i <= number / 2; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is Prime.");
        } 
        else {
            System.out.println("The number is Not Prime.");
        }

        input.close();
    }
}