package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class Exercise2 {

    public static void main(String[] args) {

        int a, b, c;
        int [] d = new int [4];

        a = 8;
        b = 0;

        try {
            c = a/b;

            System.out.println(c);

            for (int i = 0 ; i <= 4 ; i++) {
                d [i] = i;
            }

         for (int value : d) {
             System.out.println(value);
         }

        }
        catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximum array index is 3");
        }

    }
}
