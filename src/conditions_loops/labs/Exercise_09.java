package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main (String[] args) {

        for (int x = 0 ; ; x++) {
            System.out.println("This is number " + x);
            if (x == 10) {
                break;
            }
        }

    }
}
