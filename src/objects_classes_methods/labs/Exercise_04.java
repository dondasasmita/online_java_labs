package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */


class MinusMath {

    public int firstNumber;
    public int secondNumber;
    public double firstDecimal;
    public double secondDecimal;

    public void subtract(int secondNumber , int firstNumber) {
        System.out.println(secondNumber - firstNumber);
    }

    public void subtract(double secondDecimal , double firstDecimal) {
        System.out.println(secondDecimal - firstDecimal);
    }

    public void subtract(int secondNumber , double firstDecimal) {
        System.out.println(secondNumber - firstDecimal);
    }

    public void subtract(double secondDecimal , int firstNumber) {
        System.out.println(secondDecimal - secondNumber);
    }

    public static void main(String[] args) {

        MinusMath minus1 = new MinusMath();
        minus1.firstNumber = 10;
        minus1.secondNumber = 20;
        minus1.firstDecimal = 30.5;
        minus1.secondDecimal = 50.5;

      minus1.subtract(minus1.secondNumber, minus1.firstNumber);
      minus1.subtract(minus1.secondDecimal, minus1.firstDecimal);
      minus1.subtract(minus1.secondNumber, minus1.firstDecimal);
      minus1.subtract(minus1.secondDecimal, minus1.firstNumber);


    }
}


