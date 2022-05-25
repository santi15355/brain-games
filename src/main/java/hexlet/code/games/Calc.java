package hexlet.code.games;

import hexlet.code.Cli;

import static hexlet.code.Engine.getIndex;
import static hexlet.code.Engine.getRandomNumberFrom1to99;
import static hexlet.code.Engine.getRandomNumberFrom5to10;
import static hexlet.code.Engine.getRoundsToWin;
import static hexlet.code.Engine.getUserInput;
import static hexlet.code.Engine.printLooserText;
import static hexlet.code.Engine.printWinnerText;

public class Calc {
    public static void calcGame() {
        Cli.greetUser();
        var result = 0;
        final var count = 3;
        System.out.println("What is the result of the expression?");
        var scoreToWin = 0;
        for (var i = 0; i < getIndex(); i++) {
            int randomNumber1 = getRandomNumberFrom1to99();
            int randomNumber2 = getRandomNumberFrom5to10();
            String[] mathOperators = {"+", "-", "*"};
            int j = (int) (Math.random() * count);
            switch (mathOperators[j]) {
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
            System.out.println("Question: " + randomNumber1 + " " + mathOperators[j] + " " + randomNumber2);
            System.out.print("Your answer: ");
            int userAnswer = getUserInput().nextInt();
            if (userAnswer == result) {
                System.out.println("Correct!");
                scoreToWin++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + result);
                printLooserText();
                break;
            }
            if (scoreToWin == getRoundsToWin()) {
                printWinnerText();
            }
        }
    }
}
