package packages_interfaces.labs.Sports;

public class Badminton implements  Sports {

    int totalScore;

    @Override
    public int timer() {
        return 0;
    }

    @Override
    public int scoreUp() {
        totalScore += 1;
        System.out.print(totalScore);
        return totalScore;
    }

    @Override
    public String nameOfAthletes() {
        return null;
    }

    public static void main(String[] args) {

        Badminton game = new Badminton();

        for (int i = 0 ; i < 11 ; i ++) {
            game.scoreUp();
            System.out.print(" | ");
        }

    }
}
