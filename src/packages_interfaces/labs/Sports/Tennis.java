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

}
