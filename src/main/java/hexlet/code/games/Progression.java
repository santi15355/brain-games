package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRoundsCount;

public class Progression {

    public static void progressionGame() {
        int answer = 0;
        String question = "";
        String gameQuestion = "What number is missing in the progression?";
        int missingNumber = 0;
        for (var i = 0; i < getRoundsCount(); i++) {
            int[] progressions = Progression.getRandomMass();
            var massLength = progressions.length;
            var missingNumberIndex = (int) (Math.random() * massLength);
            missingNumber = progressions[missingNumberIndex];
            String[] progressionsToString = new String[massLength];
            for (var j = 0; j < massLength; j++) {
                progressionsToString[j] = Integer.toString(progressions[j]);
            }
            progressionsToString[missingNumberIndex] = "..";
            String progressionsToPrint = String.join(" ", progressionsToString);
            question = progressionsToPrint;
            answer = missingNumber;
            Engine.gameRun(gameQuestion, question, String.valueOf(answer));
        }
    }

    public static int[] getRandomMass() {
        int randomLenght = Engine.getRandomNumberFrom5to10();
        var j = 0;
        int[] progressions = new int[randomLenght];
        int randomProgressionNumber = Engine.getRandomNumberFrom5to10();
        for (var i = 0; i < progressions.length; i++) {
            progressions[i] = j + randomProgressionNumber;
            j += randomProgressionNumber;
        }
        return progressions;
    }
}
