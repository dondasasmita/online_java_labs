package conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Type a word: ");
        String word = scanner.nextLine();
        char letter = word.charAt(0);
        boolean foundVowel = false;
        int counter = 0;

        while (!foundVowel){
            letter = word.charAt(counter);
            if (letter == 'a' || letter == 'i' || letter == 'u' || letter == 'e' || letter == 'o') {
                System.out.println(word);
                System.out.println(letter);
                foundVowel = true;
            } else {
                counter ++;
            }

            }
        }

    }