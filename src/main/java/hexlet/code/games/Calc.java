package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Utils.getRandomNumberFrom1to99;
import static hexlet.code.Utils.getRandomNumberFrom5to10;

public class Calc {
    public static void calcGame() {
        int result = 0;
        int answer = 0;
        String question = "";
        String gameQuestion = "What is the result of the expression?";
        String[][] gameData = new String[ROUNDS][ROUNDS];
        for (var i = 0; i < ROUNDS; i++) {
            int randomNumber1 = getRandomNumberFrom1to99();
            int randomNumber2 = getRandomNumberFrom5to10();
            int operator = getRandomNumber();
            switch (operator) {
                case 0:
                    result = randomNumber1 + randomNumber2;
                    gameData[i][0] = randomNumber1 + " + " + randomNumber2;
                    break;
                case 1:
                    result = randomNumber1 - randomNumber2;
                    gameData[i][0] = randomNumber1 + " - " + randomNumber2;
                    break;
                case 2:
                    result = randomNumber1 * randomNumber2;
                    gameData[i][0] = randomNumber1 + " * " + randomNumber2;
                    break;
                default:
            }
            gameData[i][1] = String.valueOf(result);
        }
        Engine.gameRun(gameQuestion, gameData);
    }

    private static int getRandomNumber() {
        final var maxNumberForRandom = 3;
        var randomNumber = (int) (Math.random() * maxNumberForRandom);
        return randomNumber;
    }
}

