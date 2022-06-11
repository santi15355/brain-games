package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Utils.getRandomNumberFrom1to99;

public class Prime {
    public static void primeGame() {
        String gameQuestion = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
        String[][] gameData = new String[ROUNDS][2];
        for (var i = 0; i < ROUNDS; i++) {
            var randomNumber = getRandomNumberFrom1to99();
            gameData[i][0] = String.valueOf(randomNumber);
            gameData[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.gameRun(gameQuestion, gameData);
    }

    private static boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
