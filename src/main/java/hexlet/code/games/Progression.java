package hexlet.code.games;

import hexlet.code.Cli;

import static hexlet.code.Engine.getIndex;
import static hexlet.code.Engine.getRandomMass;
import static hexlet.code.Engine.printLooserText;
import static hexlet.code.Engine.getRoundsToWin;
import static hexlet.code.Engine.getUserInput;
import static hexlet.code.Engine.printWinnerText;
import static hexlet.code.Engine.printYourAnswer;
import static hexlet.code.Engine.printCorrect;

public class Progression {
    public static void progressionGame() {
        Cli.greetUser();
        var scoreToWin = 0;
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < getIndex(); i++) {
            int[] progressions = getRandomMass();
            var massLength = progressions.length;
            var missingNumberIndex = (int) (Math.random() * (massLength + 1));
            var missingNumber = progressions[missingNumberIndex];
            String[] progressionsToString = new String[massLength];
            for (var j = 0; j < massLength; j++) {
                progressionsToString[j] = Integer.toString(progressions[j]);
            }
            progressionsToString[missingNumberIndex] = "...";
            String progressionsToPrint = String.join(" ", progressionsToString);
            System.out.println("Question:" + " " + progressionsToPrint);
            printYourAnswer();
            int userAnswer = getUserInput().nextInt();
            if (userAnswer == missingNumber) {
                printCorrect();
                scoreToWin++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + missingNumber);
                printLooserText();
                break;
            }
            if (scoreToWin == getRoundsToWin()) {
                printWinnerText();
            }
        }
    }
}
