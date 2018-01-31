package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        double pai;
        double r;
        double h;

        pai = 3.14;
        r = 3.14;
        h = 5;

        double surface;
        double base;

        surface = 2 * pai * r * h;
        base = pai * r * r;

        System.out.println(surface + (2*base));

    }
}
