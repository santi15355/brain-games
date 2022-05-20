package hexlet.code.games;

import static hexlet.code.Engine.getIndex;
import static hexlet.code.Engine.printLooserText;
import static hexlet.code.Engine.getRandomNumberMaxfrom1to99;
import static hexlet.code.Engine.getRandomNumberMinFrom5to10;
import static hexlet.code.Engine.getRoundsToWin;
import static hexlet.code.Engine.getUserInput;
import static hexlet.code.Engine.printWinnerText;
import static hexlet.code.Engine.printYourAnswer;
import static hexlet.code.Engine.printCorrect;

public class GCD {
    public static void gcdGame() {
        var scoreToWin = 0;
        var gcd = 0;
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < getIndex(); i++) {
            int randomNumber1 = getRandomNumberMinFrom5to10();
            int randomNumber2 = getRandomNumberMaxfrom1to99();
            System.out.println("Question: " + randomNumber2 + " " + randomNumber1);
            printYourAnswer();
            int userAnswer = getUserInput().nextInt();
            for (var j = 1; j <= randomNumber1 && j <= randomNumber2; j++) {
                if (randomNumber1 % j == 0 && randomNumber2 % j == 0) {
                    gcd = j;
                }
            }
            if (userAnswer == gcd) {
                printCorrect();
                scoreToWin++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + gcd);
                printLooserText();
                break;
            }
            if (scoreToWin == getRoundsToWin()) {
                printWinnerText();
            }
        }
    }
}
