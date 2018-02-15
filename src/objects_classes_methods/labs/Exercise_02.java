package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

class Students {

    private String country;
    private  static int numOfStudents; //static variable

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    Students(){ // constructor
        numOfStudents = 0;
    }


    public static void main(String[] args) {

        Students A = new Students();
        A.setCountry("Singapore");
        numOfStudents ++;
        System.out.println("The country of students is " + A.getCountry()); // static calling non-static method
        System.out.println("Number of students from "+ A.getCountry() + " is " + numOfStudents); // static calling static method

    }
}

