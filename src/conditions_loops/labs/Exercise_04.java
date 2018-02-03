package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {

    public static void main (String[] args){

        for (int counter = 2; counter < 101 ; counter += 2 ) {
            System.out.println(counter);
        }
    }
}
