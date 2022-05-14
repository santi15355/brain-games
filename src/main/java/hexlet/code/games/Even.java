package hexlet.code.games;

import static hexlet.code.Engine.printCorrect;
import static hexlet.code.Engine.getIndex;
import static hexlet.code.Engine.printLooserText;
import static hexlet.code.Engine.getRandomNumberMax;
import static hexlet.code.Engine.getRoundsToWin;
import static hexlet.code.Engine.getScoreToWin;
import static hexlet.code.Engine.getUserInput;
import static hexlet.code.Engine.printWinnerText;
import static hexlet.code.Engine.printYourAnswer;

public class Even {
    public static void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var scoreToWin = getScoreToWin();
        for (var i = 0; i < getIndex(); i++) {
            int randomNumber = getRandomNumberMax();
            int isEven = randomNumber % 2;
            System.out.println("Question: " + randomNumber);
            printYourAnswer();
            String userAnswer = getUserInput().nextLine();
            userAnswer = userAnswer.toLowerCase();
            if ((isEven == 0 & userAnswer.equals("yes")) | (isEven != 0 & userAnswer.equals("no"))) {
                printCorrect();
                scoreToWin++;
            } else {
                String yes = "'yes'";
                String no = "'no'";
                if (userAnswer.equals("yes")) {
                    System.out.println(yes + " is wrong answer ;(. Correct answer was " + no + ".");
                    printLooserText();
                    //System.out.println(" Let's try again, " + Cli.getName() + "!");
                } else if (userAnswer.equals("no")) {
                    //System.out.println(no + " is wrong answer ;(. Correct answer was " + yes + ".");
                    printLooserText();
                }
                break;
            }
            if (scoreToWin == getRoundsToWin()) {
                printWinnerText();
            }
        }
    }
}
