package conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a number for the lower bound: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter a number for the upper bound: ");
        int number2 = scanner.nextInt();

        double totalNumber = 0;
        double average;
        double totalCycle = 0;

        for (int x = number1 ; x <= number2 ; x++ ) {
            totalNumber += x;
            totalCycle = x;

        }
        average = totalNumber/totalCycle;

        System.out.println("The sum is " + totalNumber);
        System.out.println("The average is " + average);
    }
}
