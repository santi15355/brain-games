package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRoundsCount;

public class Even {
    public static void evenGame() {
        var question = 0;
        var answer = "";
        Engine.gameQuestion("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < getRoundsCount(); i++) {
            question = getRandomNumberFrom1to99();
            answer = (question % 2 == 0) ? "yes" : "no";
            Engine.gameRun(String.valueOf(question), answer);
        }
    }
}
