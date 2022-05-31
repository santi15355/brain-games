package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRandomNumberFrom5to10;
import static hexlet.code.Engine.getRoundsCount;

public class Calc {
    public static void calcGame() {
        int result = 0;
        int answer = 0;
        String question = "";
        Engine.gameQuestion("What is the result of the expression?");
        for (var i = 0; i < getRoundsCount(); i++) {
            int randomNumber1 = getRandomNumberFrom1to99();
            int randomNumber2 = getRandomNumberFrom5to10();
            String operator = Calc.getOperator();
            switch (operator) {
                case "+":
                    result = randomNumber1 + randomNumber2;
                    break;
                case "-":
                    result = randomNumber1 - randomNumber2;
                    break;
                case "*":
                    result = randomNumber1 * randomNumber2;
                    break;
                default:
            }
            question = randomNumber1 + " " + operator + " " + randomNumber2;
            answer = result;
            Engine.gameRun(question, String.valueOf(answer));
        }
    }

    public static String getOperator() {
        final var count = 3;
        String[] mathOperators = {"+", "-", "*"};
        int operator = (int) (Math.random() * count);
        return mathOperators[operator];
    }
}
