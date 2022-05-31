package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRoundsCount;

public class GCD {
    public static void gcdGame() {
        int answer = 0;
        String question = "";
        String gameQuestion = "Find the greatest common divisor of given numbers.";
        for (var i = 0; i < getRoundsCount(); i++) {
            int randomNumber1 = getRandomNumberFrom1to99();
            int randomNumber2 = getRandomNumberFrom1to99();
            question = randomNumber1 + " " + randomNumber2;
            answer = Integer.parseInt(Integer.toString(getGCD(randomNumber1, randomNumber2)));
            Engine.gameRun(gameQuestion, question, String.valueOf(answer));
        }
    }

    private static int getGCD(int randomNumber1, int randomNumber2) {
        return randomNumber2 == 0 ? randomNumber1 : getGCD(randomNumber2, randomNumber1 % randomNumber2);
    }
}
