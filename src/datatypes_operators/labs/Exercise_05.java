package datatypes_operators.labs;
import java.util.Scanner;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner userInput = new Scanner(System.in);
        boolean aboveNine = false;

        while (!aboveNine) {
            System.out.print("Enter a number from 0 - 9 :");
            int userChoice = userInput.nextInt();
            if ( userChoice <= 9) {
                System.out.println("The number in the array is ... " + array [userChoice]);
                aboveNine = true;
            }
            else{
                System.out.println("Error! Replay!");
            }
        }

    }
}