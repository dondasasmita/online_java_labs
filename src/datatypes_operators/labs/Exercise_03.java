package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can beD
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        // write code here
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();
        char firstLetter = name.charAt(0);
        System.out.println(name.substring(1) + firstLetter + "ay");

    }
}


