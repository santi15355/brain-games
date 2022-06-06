package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.getRandomNumberFrom1to99;

public class Even {
    public static void evenGame() {
        String gameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = new String[ROUNDS][ROUNDS];
        for (var i = 0; i < ROUNDS; i++) {
            var randomNumber = getRandomNumberFrom1to99();
            gameData[i][0] = String.valueOf(randomNumber);
            gameData[i][1] = (randomNumber % 2 == 0) ? "yes" : "no";
        }
        Engine.gameRun(gameQuestion, gameData);
    }
}
