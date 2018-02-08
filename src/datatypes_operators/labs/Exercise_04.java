package datatypes_operators.labs;
import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers Fin an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);


         int [] array = new int [10];

         for (int i = 0 ; i < array.length ; i++) {
             System.out.print("Enter a number : ");
             int numberByUser = userinput.nextInt();
             array [i] = numberByUser;
         }

        for (int i = 0 ; i < array.length ; i++) {
            System.out.println("Array in index " + i + " is number " + array [i]);
        }

    }
}
