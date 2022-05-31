package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRoundsCount;

public class Prime {
    public static void primeGame() {
        String answer = "";
        int question = 0;
        String gameQuestion = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
        int isPrime;
        int k = 2;
        for (var i = 0; i < getRoundsCount(); i++) {
            var temp = 0;
            var randomNumber = getRandomNumberFrom1to99();
            //System.out.println("Question: " + randomNumber);
            for (k = 2; k < randomNumber; k++) {
                isPrime = randomNumber % k;
                if (isPrime == 0) {
                    temp++;
                    break;
                }
            }
            question = randomNumber;
            answer = (temp == 0) ? "yes" : "no";
            Engine.gameRun(gameQuestion, String.valueOf(question), String.valueOf(answer));
        }
    }
}
