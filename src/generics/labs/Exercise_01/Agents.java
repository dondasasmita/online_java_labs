package generics.labs.Exercise_01;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Agents <T> {

    public T t; //code of the agent is a dynamic type. (Example: "Beast", "0.08", etc).
    public String fullName;
    public String nationality;

    public Agents(T t, String fullName, String nationality) {
        this.t = t;
        this.fullName = fullName;
        this.nationality = nationality;
    }

    public void displayInfo () {
        System.out.println("Name : " + this.fullName);
        System.out.println("Nationality : " + this.nationality);
        System.out.println("Code : " + this.getT()); //this is dynamic, another method needs to be called
        System.out.println("======\n");
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
