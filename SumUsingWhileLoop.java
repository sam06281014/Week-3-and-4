// Program Name: SumUsingWhileLoop
// Description: Calculates sum from 1 to N

import java.util.Scanner;

public class SumUsingWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limit;
        int counter = 1;
        int sum = 0;

        System.out.print("Enter the limit: ");
        limit = input.nextInt();

        // While loop
        while (counter <= limit) {
            sum = sum + counter;
            counter++;
        }

        System.out.println("Total Sum is: " + sum);

        input.close();
    }
}