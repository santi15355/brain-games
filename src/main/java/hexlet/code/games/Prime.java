package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRoundsCount;

public class Prime {
    public static void primeGame() {
        String answer = "";
        int question = 0;
        String gameQuestion = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
        for (var i = 0; i < getRoundsCount(); i++) {
            var randomNumber = getRandomNumberFrom1to99();
            question = randomNumber;
            answer = isPrime(randomNumber) ? "no" : "yes";
            Engine.gameRun(gameQuestion, String.valueOf(question), answer);
        }
    }

    private static boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
