package exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

/* This program will check the person's age
if the person age is above 18 OR height is above 170 then
the program should return that the person is eligible to enroll in pilot school
 */

class PilotSchoolRegistration {

    static void checkAgeandID (int age, int height) {

        if (age < 18 && height < 170) {
            throw new ArithmeticException("The person is not eligible to enroll at the pilot school");
        }
        else {
            System.out.println("The person is eligible for registration at pilot school");
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to pilot school registration");

        checkAgeandID(17,169);

        System.out.println("Thank you.");


    }
}