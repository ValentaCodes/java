package Unidentified;

public class ifThen {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The highscore is " + highScore);

        System.out.println("The next high score is " + calculateScore(true, 5000, 8, 200));

        int highScorePosition = calculateHighScorePosition(7090);
        displayHighScorePosition("Tim", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }


    public static int calculateHighScorePosition(int score) {
        int position = 1;
        if (score < 100) {
            position = 4;
        }
        else if (score < 500) {
           position = 3;
        }
        else if (score < 1000) {
            position = 2;
        }
            return position;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println( name + ", has managed to reach position " + position + ".");
    }
}
