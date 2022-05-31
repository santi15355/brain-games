package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRoundsCount;

public class Prime {
    public static void primeGame() {
        String answer = "";
        int question = 0;
        Engine.gameQuestion("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        for (var i = 0; i < getRoundsCount(); i++) {
            var randomNumber = getRandomNumberFrom1to99();
            question = randomNumber;
            answer = isPrime(randomNumber) ? "yes" : "no";
            Engine.gameRun(String.valueOf(question), answer);
        }
    }

    public static boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return false;
        }

        if (randomNumber % 2 == 0) {
            return true;
        }
        return false;
    }
}
