package objects_classes_methods.labs;

import javax.smartcardio.Card;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */


// Black Jack Game


class Cards extends Players {

    public static int numberOfCards = 52;
//    public int [] cardsOnHand; new int [5];


    public void dealCards() {
        numberOfCards -= (numberOfPlayers * 2); // numberOfCards subtract by (numberOfPlayers * 2)
    }

    public void hit() {
        numberOfCards -= 1; // take one card from the deck
    }

    //populate the the cardsOnHand (distribute 2 cards per player)
//    public void distributeCards() {
//        for (int counter = 0 ; counter <)
//    }

}

class Tables extends Players {


    public static int numOfSeat = 6;

    public void playersTakeSeat()
    {
        numOfSeat -= numberOfPlayers;
    }

    public void releaseSeat() {
        numOfSeat += numberOfPlayers;
    }

}

class Players  {

    public static int numberOfPlayers = 0;
 //   public int [] cardsOnHand; new int [5];

    public void createPlayer () {
        numberOfPlayers += 1;

    }

}

class Controller extends  Players {

    public static void main(String[] args) {

        Players player1 = new Players();
        Players player2 = new Players();
        Players player3 = new Players();
        player1.createPlayer();
        player2.createPlayer();
        player3.createPlayer();

        Tables table1 = new Tables();
        table1.playersTakeSeat();

        Cards game1 = new Cards();
        game1.dealCards();
        game1.hit();
        game1.hit();


        //print the number of cards on hand, number of players, number of remaining seats, number of remaining cards

        System.out.println("The number of players are " + numberOfPlayers );
        System.out.println("The remaining cards are " + game1.numberOfCards);
        System.out.println("The remaining number of seats is " + table1.numOfSeat);
    }


}

