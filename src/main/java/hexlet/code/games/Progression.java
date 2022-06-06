package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;

public class Progression {

    public static void progressionGame() {
        String gameQuestion = "What number is missing in the progression?";
        int missingNumber = 0;
        String[][] gameData = new String[ROUNDS][ROUNDS];
        for (var i = 0; i < ROUNDS; i++) {
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
            gameData[i][0] = progressionsToPrint;
            gameData[i][1] = String.valueOf(missingNumber);
        }
        Engine.gameRun(gameQuestion, gameData);
    }

    private static int[] getRandomMass() {
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
