package hexlet.code.games;

import static hexlet.code.Engine.printCorrect;
import static hexlet.code.Engine.getIndex;
import static hexlet.code.Engine.printLooserText;
import static hexlet.code.Engine.getRandomNumberMaxfrom1to99;
import static hexlet.code.Engine.getRoundsToWin;
import static hexlet.code.Engine.getUserInput;
import static hexlet.code.Engine.printWinnerText;
import static hexlet.code.Engine.printYourAnswer;

public class Prime {
    public static void primeGame() {
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        var scoreToWin = 0;
        boolean check = true;
        String yes = "'yes'";
        String no = "'no'";
        int isPrime;

        for (var i = 0; i < getIndex(); i++) {
            var temp = 0;
            var randomNumber = getRandomNumberMaxfrom1to99();
            System.out.println("Question: " + randomNumber);
            printYourAnswer();
            String userAnswer = getUserInput().nextLine();
            userAnswer = userAnswer.toLowerCase();
            for (var k = 2; k < randomNumber; k++) {
                isPrime = randomNumber % k;
                if (isPrime == 0) {
                    temp++;
                    System.out.println(temp);
                    break;
                }
            }
            if (temp >= 1 & userAnswer.equals("no") | temp == 0 & userAnswer.equals("yes")) {
                printCorrect();
                scoreToWin++;
                //break;
            } else {
                if (userAnswer.equals("yes")) {
                    System.out.println(yes + " is wrong answer ;(. Correct answer was " + no + ".");
                    printLooserText();
                } else if (userAnswer.equals("no")) {
                    System.out.println(no + " is wrong answer ;(. Correct answer was " + yes + ".");
                    printLooserText();
                }
                break;
            }
        } if (scoreToWin == getRoundsToWin()) {
            printWinnerText();
        }
    }
}
