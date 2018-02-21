package packages_interfaces.labs.Sports;

public class SportsDemo {

    public static void main(String[] args) {

        Badminton game = new Badminton();

        System.out.println("Badminton Game");

        for (int i = 0 ; i < 11 ; i ++) {
            game.scoreUp();
            System.out.print(" | ");
        }

        System.out.println("\nTennis Game");

        int maximumScorePerSet = 40;

        Tennis gameTennis = new Tennis();

        for (int i = 0 ; gameTennis.totalScore < maximumScorePerSet ; i ++) {
            gameTennis.scoreUp();
            System.out.print(" | ");
        }

    }
}
