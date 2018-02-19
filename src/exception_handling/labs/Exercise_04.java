package exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class Exercise4 {

    public static void main(String[] args) {

       try {
           System.out.println("This is the outer try block that will execute");
           try {
               int example = 8 / 0;
           }
           catch (ArithmeticException e) {
               System.out.println("   Unable to divide by 0 (caught by the catch inside)");
           }
       }
       catch (ArithmeticException e){
            System.out.println("This is the outside catch"); //will not be printed
        }
        System.out.println("Anything else outside the try and catch");
    }
}