package objects_classes_methods.labs;

import inheritance.examples.Mammal;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

class Animals {

    public boolean mammals;

    public boolean isMammals() {
        System.out.println("is a mammal");
        return mammals;
    }

    public void setMammals(boolean mammals) {
        this.mammals = mammals;
    }
}

class Pets extends Animals {

//    public Pets (boolean mammals) {
//        return setMammals();
//    }

    public double weight;
    public String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {


        Pets dog = new Pets();
        dog.setWeight(10.5);
        dog.setName("Jojo");
        dog.setMammals(true);

        Pets bird = new Pets();
        bird.setWeight(1.5);
        bird.setName("Fly");
        bird.setMammals(false);


        System.out.println(dog.getName() + " is a " + dog.getWeight() + dog.isMammals() ); //what is the difference between getName() and .name
        System.out.println(bird.name + " is not a mammal. and it weighs " +  bird.getWeight());

        //print out list of mammals and non-mammals along with the information



    }

}
