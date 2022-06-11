package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Utils.getRandomNumberFrom1to99;

public class GCD {
    public static void gcdGame() {
        String gameQuestion = "Find the greatest common divisor of given numbers.";
        String[][] gameData = new String[ROUNDS][2];
        for (var i = 0; i < ROUNDS; i++) {
            int randomNumber1 = getRandomNumberFrom1to99();
            int randomNumber2 = getRandomNumberFrom1to99();
            gameData[i][0] = randomNumber1 + " " + randomNumber2;
            gameData[i][1] = String.valueOf(getGCD(randomNumber1, randomNumber2));
        }
        Engine.gameRun(gameQuestion, gameData);
    }

    private static int getGCD(int randomNumber1, int randomNumber2) {
        return randomNumber2 == 0 ? randomNumber1 : getGCD(randomNumber2, randomNumber1 % randomNumber2);
    }
}
