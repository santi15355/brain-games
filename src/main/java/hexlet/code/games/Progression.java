package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Utils.getRandomNumberFrom1to99;
import static hexlet.code.Utils.getRandomNumberFrom5to10;

public class Progression {

    public static void progressionGame() {
        String gameQuestion = "What number is missing in the progression?";
        String[][] gameData = new String[ROUNDS][2];
        for (var i = 0; i < ROUNDS; i++) {
            var firstNumberOfProgression = getRandomNumberFrom1to99();
            var sizeOfProgression = getRandomNumberFrom5to10();
            var stepOfProgression = getRandomNumberFrom5to10();
            int[] progressions = getRandomMass(firstNumberOfProgression, sizeOfProgression, stepOfProgression);
            var missingNumberIndex = (int) (Math.random() * sizeOfProgression);
            var missingNumber = progressions[missingNumberIndex];
            gameData[i][0] = getHiddenNumberProgression(sizeOfProgression, progressions, missingNumberIndex);
            gameData[i][1] = String.valueOf(missingNumber);
        }
        Engine.gameRun(gameQuestion, gameData);
    }

    private static int[] getRandomMass(int firstNumber, int size, int step) {
        int[] progressions = new int[size];
        for (var i = 0; i < progressions.length; i++) {
            progressions[i] = firstNumber + i * step;
        }
        return progressions;
    }

    private static String getHiddenNumberProgression(int size, int[] progressions, int missingIndex) {
        String[] progressionsToString = new String[size];
        for (var j = 0; j < size; j++) {
            progressionsToString[j] = Integer.toString(progressions[j]);
        }
        progressionsToString[missingIndex] = "..";
        String progressionsToPrint = String.join(" ", progressionsToString);
        return progressionsToPrint;
    }
}
