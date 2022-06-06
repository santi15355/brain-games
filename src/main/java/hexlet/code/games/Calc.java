package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRandomNumberFrom5to10;

public class Calc {
    public static void calcGame() {
        int result = 0;
        String gameQuestion = "What is the result of the expression?";
        String[][] gameData = new String[ROUNDS][ROUNDS];
        for (var i = 0; i < ROUNDS; i++) {
            int randomNumber1 = getRandomNumberFrom1to99();
            int randomNumber2 = getRandomNumberFrom5to10();
            String operator = getOperator();
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
            gameData[i][0] = randomNumber1 + " " + operator + " " + randomNumber2;
            gameData[i][1] = String.valueOf(result);
        }
        Engine.gameRun(gameQuestion, gameData);
    }

    private static String getOperator() {
        final var count = 3;
        String[] mathOperators = {"+", "-", "*"};
        int operator = (int) (Math.random() * count);
        return mathOperators[operator];
    }
}
