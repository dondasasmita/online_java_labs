package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int row;
        int column;
        int filler = 0;

        int[][] twoDArray = new int[5][5];

        // populate the array with multiples of 3
        for ( row = 0 ; row < twoDArray.length  ; row += 1) {
            for (column = 0; column < twoDArray[row].length ; column +=1) {
                twoDArray [row] [column] = filler += 3;
            }
        }

         // to print the results
//        for ( row = 0 ; row < twoDArray.length  ; row +=1) {
//            for (column = 0 ; column < twoDArray[row].length ; column +=1) {
//                System.out.print(twoDArray [row] [column] + " ");
//            }
//            System.out.println();
//        }

        // using enhanced loop tp print the result. a much cleaner code.
        for (int[] x : twoDArray ) {                    // create an array
            for (int y : x) {                           // for every value in the array
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
