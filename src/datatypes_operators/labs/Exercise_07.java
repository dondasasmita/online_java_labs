package datatypes_operators.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

//similar to exercise 6 but different sizes.

public class Exercise_07 {


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        ArrayList <String> friendsList = new ArrayList();
        System.out.print("How many bestfriends do you have? ");
        int numberOfFriends = userInput.nextInt();

        for (int counter = 0 ; counter < numberOfFriends ; counter += 1) {
            System.out.print("Enter your friend's name: ");
            String nameOfFriend = userInput.next();
            friendsList.add(nameOfFriend);
        }
        System.out.println("You have "+ numberOfFriends + " bestfriends and they are ... " + friendsList);

    }

}
