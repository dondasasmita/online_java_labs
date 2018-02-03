package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main (String[] args) {

        label1:
        for (int x = 0 ; x <= 10 ; x++) {
            System.out.println("We are counting " + x);
            for (int y = 0 ; y <= 10 ; y ++) {
                System.out.println("This is inside loop number: " + y);
                if (y == 5) continue label1;
            }
        }
            }

    }

