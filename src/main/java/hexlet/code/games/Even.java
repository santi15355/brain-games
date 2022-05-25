package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import static hexlet.code.Engine.printCorrect;
import static hexlet.code.Engine.getIndex;
import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRoundsToWin;
import static hexlet.code.Engine.getUserInput;
import static hexlet.code.Engine.printWinnerText;
import static hexlet.code.Engine.printYourAnswer;

public class Even {
    private static String userAnswer;
    public static void evenGame() {
        Cli.greetUser();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var scoreToWin = 0;
        for (var i = 0; i < getIndex(); i++) {
            int randomNumber = getRandomNumberFrom1to99();
            int isEven = randomNumber % 2;
            System.out.println("Question: " + randomNumber);
            printYourAnswer();
            userAnswer = getUserInput().nextLine().toLowerCase();
            if ((isEven == 0 & userAnswer.equals("yes")) | (isEven != 0 & userAnswer.equals("no"))) {
                printCorrect();
                scoreToWin++;
            } else {
                Engine.test();
                break;
            }
        }
        if (scoreToWin == getRoundsToWin()) {
            printWinnerText();
        }
    }
    public static String getUserAnswer() {
        return userAnswer;
    }
}
