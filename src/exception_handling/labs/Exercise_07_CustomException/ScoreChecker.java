package exception_handling.labs.Exercise_07_CustomException;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */


/* This program will check students results for pass or fail.
   There are 2 test scores. If both are below 60, students will fail.
   Exceptions for those who score 59 in both test, re-test may apply;
 */

class ScoreChecker {

    static void checkScore (int score1, int score2) throws CustomException {

        if ((score1 <= 59 && score1 >= 55) && (score2 <=59 && score2 >=55)) {
            throw new CustomException();
        }
        if (score1 < 60 && score2 < 60 ) {
            System.out.println("You do not qualify to proceed to the next level.");
        }

        if (score1 > 100 && score2 > 100) {
            System.out.println("There is an error, re-check score.");
        }
        else {
            System.out.println("Congratulations, you may proceed to the next level");
        }
    }


    public static void main(String[] args) {

        System.out.println("Welcome to CodingNomads");

        try {
            checkScore(59,57);
        }
        catch (CustomException e) {
            e.requestReTest();
        }

        System.out.println("Thank you.");


    }
}