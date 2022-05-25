package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    static final int MIN_1 = 2;
    static final int MIN_2 = 5;
    static final int MIN_3 = 10;
    static final int MAX = 99;
    static final int ROUNDS_TO_WIN = 3;
    static final int INDEX = 3;
    private static int randomNumberMin;
    private static int randomNumberMax;
    private static Scanner userInput = new Scanner(System.in);

    public static int getIndex() {
        return INDEX;
    }

    public static int getRoundsToWin() {
        return ROUNDS_TO_WIN;
    }

    public static int getRandomNumberFrom5to10() {
        randomNumberMin = MIN_2 + (int) (Math.random() * (MIN_3 - MIN_2 + 1));
        return randomNumberMin;
    }

    public static int getRandomNumberFrom1to99() {
        randomNumberMax = MIN_1 + (int) (Math.random() * MAX);
        return randomNumberMax;
    }

    public static Scanner getUserInput() {
        return userInput;
    }

    public static void printWinnerText() {
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    public static void printLooserText() {
        System.out.println("Let's try again, " + Cli.getName() + "!");
    }

    public static void printYourAnswer() {
        System.out.print("Your Answer: ");
    }

    public static void printCorrect() {
        System.out.println("Correct!");
    }

    public static int[] getRandomMass() {
        int randomLenght = getRandomNumberFrom5to10();
        var j = 0;
        int[] progressions = new int[randomLenght];
        int randomProgressionNumber = getRandomNumberFrom5to10();
        for (var i = 0; i < progressions.length; i++) {
            progressions[i] = j + randomProgressionNumber;
            j += randomProgressionNumber;
        }
        return progressions;
    }
    public static void test() {
        if (Even.getUserAnswer().equals("yes")) {
            System.out.println("'yes'" + " is wrong answer ;(. Correct answer was " + "'no'" + ".");
            printLooserText();
        } else if (Even.getUserAnswer().equals("no")) {
            System.out.println("'no'" + " is wrong answer ;(. Correct answer was " + "'yes'" + ".");
            printLooserText();
        }
    }
}

