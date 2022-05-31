package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRandomNumberFrom5to10;
import static hexlet.code.Engine.getRoundsCount;

public class GCD {
    public static void gcdGame() {
        int answer = 0;
        String question = "";
        String gameQuestion = "Find the greatest common divisor of given numbers.";
        int gcd = 0;
        for (var i = 0; i < getRoundsCount(); i++) {
            int randomNumber1 = getRandomNumberFrom5to10();
            int randomNumber2 = getRandomNumberFrom1to99();
            for (var j = 1; j <= randomNumber1 && j <= randomNumber2; j++) {
                if (randomNumber1 % j == 0 && randomNumber2 % j == 0) {
                    gcd = j;
                }
            }
            question = randomNumber1 + " " + randomNumber2;
            answer = gcd;
            Engine.gameRun(gameQuestion, question, String.valueOf(answer));
        }
    }
}
