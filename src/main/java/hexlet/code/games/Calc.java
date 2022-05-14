package hexlet.code.games;

import static hexlet.code.Engine.getIndex;
import static hexlet.code.Engine.getRandomNumberMax;
import static hexlet.code.Engine.getRandomNumberMin;
import static hexlet.code.Engine.getRoundsToWin;
import static hexlet.code.Engine.getUserInput;
import static hexlet.code.Engine.printLooserText;
import static hexlet.code.Engine.printWinnerText;

public class Calc {
    public static void calcGame() {
        var result = 0;
        final var count = 3;
        System.out.println("What is the result of the expression?");
        var scoreToWin = 0;
        for (var i = 0; i < getIndex(); i++) {
            int randomNumber1 = getRandomNumberMax();
            int randomNumber2 = getRandomNumberMin();
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
            System.out.println("Question: " + randomNumber1 + mathOperators[j] + randomNumber2);
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
