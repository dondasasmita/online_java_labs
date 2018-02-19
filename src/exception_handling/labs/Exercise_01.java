package exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise1 {

    public static void main(String[] args) {

        int x,y,z;

        x = 8;
        y = 0;
        z = 0;

        try {
            z = x/y;
        }
        catch (Exception e) {
            System.out.println("Cannot be divided by 0");
        }
        System.out.println(z);

    }

}