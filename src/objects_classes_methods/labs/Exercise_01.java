package objects_classes_methods.labs;
import java.util.Scanner;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */


class Smartphones {

    String operatingSystem;
    String model;
    int battery;

    public void powerOn(){
        System.out.println("Welcome to " + operatingSystem + " Phone");
        battery -= 5;
        System.out.println("Battery is " + battery + " %");
    }

    public void calling(){
        System.out.println("Connecting");
        battery -=10;
        System.out.println("Remaining battery is " + battery + " %");
    }

    public void gaming (){
        System.out.println("Opening a Game");
        battery -= 50;
        System.out.println("Game completed and the remaining battery is " + battery);

    }

    public void charging (){
        System.out.println("Charging");
        battery = 100;
        System.out.println("Battery is full");
    }

    public void switchOff (){
        System.out.println("GoodBye");
    }

}


class AndroidPhone extends Smartphones {



}

class IosPhone extends Smartphones {

    int IosPhoneBattery = battery + 20;

    //methods

}

class PhoneController{



    public static void main(String[] args) {

        AndroidPhone pixelPhone = new AndroidPhone();
        pixelPhone.operatingSystem = "Android";
        pixelPhone.model = "Google Pixel 2";
        pixelPhone.battery = 100;

        IosPhone iPhoneX = new IosPhone();
        iPhoneX.operatingSystem = "iOS";
        iPhoneX.model = "iPhone X";
        iPhoneX.battery = 100;


//        Scanner scanner = new Scanner(System.in);
//        int phoneChoice;
//        int userChoice;
//
//        System.out.println("Enter 1 for Google Pixel OR Enter 2 for iPhone X : ");
//        phoneChoice = scanner.nextInt();
//        if (phoneChoice == 1) {
//            phoneChoice = pixelPhone;
//            System.out.println("You have an " + pixelPhone.operatingSystem + " phone");
//        } else {
//            phoneChoice = iPhoneX;
//            System.out.println("You have an " + iPhoneX.operatingSystem + " phone");
//        }


//        System.out.println("Enter 1 to power On, 2 to call, 3 to game, 4 to charge, 5 to switch off");
//        userChoice = scanner.nextInt();
//
//        switch (userChoice) {
//            case 1:
//                phoneChoice.powerOn();
//                break;
//            case 2:
//                pixelPhone.calling();
//                break;
//            case 3:
//                pixelPhone.gaming();
//                break;
//            case 4:
//                pixelPhone.charging();
//                break;
//            case 5:
//                pixelPhone.switchOff();
//                break;
//        }


        System.out.println(" ------------ ");




    }

}