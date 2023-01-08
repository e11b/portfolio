public class MainChallenge {
//    public static void main(String[] args) {
//
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("The highScore is " + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        System.out.println("The next highScore is " +
//                calculateScore(gameOver, score, levelCompleted, bonus));
//    }
//
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        int finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted + bonus);
//            finalScore += 1000;
//        }
//
//        return finalScore;
//    }
    public static void main(String[] args) {

        String playerName = "Polina";
        int finalScore = 1500;
        int position = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, position);

        playerName = "Louie";
        finalScore = 1000;
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, position);

        playerName = "Eric";
        finalScore = 100;
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, position);

        playerName = "Alexis";
        finalScore = 100;
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, position);

        playerName = "Lyanna";
        finalScore = 25;
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, position);
    }

    public static int calculateHighScorePosition (int finalScore) {

        int position = 4;

        if (finalScore >= 1000) {
            position = 1;
        } else if(finalScore >= 500) {
            position = 2;
        } else if(finalScore >= 100) {
            position = 3;
        }
        return position;

    }

    public static void displayHighScorePosition (String playerName, int position){
        System.out.println( playerName + " managed to get into position "
                + position + " on the high score list");
    }

}