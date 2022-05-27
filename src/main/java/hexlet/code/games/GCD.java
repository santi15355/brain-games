package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import static hexlet.code.Engine.getIndex;
import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRandomNumberFrom5to10;
import static hexlet.code.Engine.getRoundsToWin;
import static hexlet.code.Engine.getUserInput;
import static hexlet.code.Engine.printWinnerText;
import static hexlet.code.Engine.printYourAnswer;
import static hexlet.code.Engine.printCorrect;

public class GCD {
    private static int gcd = 0;
    public static void gcdGame() {
        Cli.greetUser();
        var scoreToWin = 0;
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < getIndex(); i++) {
            int randomNumber1 = getRandomNumberFrom5to10();
            int randomNumber2 = getRandomNumberFrom1to99();
            System.out.println("Question: " + randomNumber2 + " " + randomNumber1);
            printYourAnswer();
            int userAnswer = Integer.parseInt(getUserInput());
            for (var j = 1; j <= randomNumber1 && j <= randomNumber2; j++) {
                if (randomNumber1 % j == 0 && randomNumber2 % j == 0) {
                    gcd = j;
                }
            }
            if (userAnswer == gcd) {
                printCorrect();
                scoreToWin++;
            } else {
                Engine.printLooserTextGCD();
                break;
            }
            if (scoreToWin == getRoundsToWin()) {
                printWinnerText();
            }
        }
    }
    public static int getGCD() {
        return gcd;
    }
}
