package generics.labs.Exercise_01;

public class HQ {

    public static void main(String[] args) {

        Agents <Double> bond = new Agents <> (0.07, "James Bond", "British");

        Agents <Integer> renton = new Agents <> (6, "Andy Renton", "American");

        bond.displayInfo();
        renton.displayInfo();

    }

}
