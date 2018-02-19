package exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class Exercise3 {

    public static void main(String[] args) {

        String [] array = new String [4];

        try {
            String name = array [4]; // the biggest index is 3
            System.out.println(" This is inside the try block");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception is caught in here, Unable to process because index is bigger than 3");
        }
        finally {
            System.out.println("Finally, this block is executed.");
        }
        System.out.println("This is the execution outside the try/catch/finally blocks.");
    }
}