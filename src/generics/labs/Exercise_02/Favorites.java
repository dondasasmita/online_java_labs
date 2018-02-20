package generics.labs.Exercise_02;

import java.util.Scanner;

/**
 *      Create a class with a generic method that takes in an array and prints out the value at a certain index.
 */

class Favorites {


    public static <E> void displayAllFavorites (E [] favoriteThings) {

        for (E elements : favoriteThings) {
            System.out.print(elements + ", ");
        }
        System.out.println();
    }

    public static <E> void displayByIndex (E [] favoriteThings , int index) {
        System.out.println(favoriteThings[index]);
    }

    public static void main(String[] args) {

        Integer [] favoriteNumbers =  {15, 31, 1, 7, 4, 12};
        String [] favoriteSuperHeroes = {"Spiderman", "Batman", "the Hulk", "Ironman"};
        Character [] favoriteCharacters = { 'M', 'J', 'L', 'V', 'T'};

        System.out.println("Displaying all...");
        System.out.print("Favorite letters are ");
        displayAllFavorites(favoriteCharacters);
        System.out.print("Favorite superheroes are  ");
        displayAllFavorites(favoriteSuperHeroes);
        System.out.print("Favorite numbers are ");
        displayAllFavorites(favoriteNumbers);

        System.out.println("\nDisplay By Index...");
        System.out.print("One favorite number is ");
        displayByIndex(favoriteNumbers,1);
        System.out.print("One favorite superhero is ");
        displayByIndex(favoriteSuperHeroes, 3);

    }



}