package packages_interfaces.labs.Sports;

public class Tennis implements Sports {

    int totalScore;

    @Override
    public int timer() {
        return 0;
    }

    @Override
    public int scoreUp() {
        totalScore += 15;
        System.out.print(totalScore);
        return totalScore;
    }

    @Override
    public String nameOfAthletes() {
        return null;
    }

    public static void main(String[] args) {

        int maximumScorePerSet = 40;

        Tennis game = new Tennis();

        for (int i = 0 ; game.totalScore < maximumScorePerSet ; i ++) {
            game.scoreUp();
            System.out.print(" | ");
        }


    }
}
