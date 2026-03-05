// Program Name: BreakContinueDemo
// Description: Demonstrates break and continue statements

public class BreakContinueDemo {

    public static void main(String[] args) {

        // For loop from 1 to 10
        for (int number = 1; number <= 10; number++) {

            // Skip number 5
            if (number == 5) {
                continue;
            }

            // Stop loop at 8
            if (number == 8) {
                break;
            }

            System.out.println("Number: " + number);
        }
    }
}