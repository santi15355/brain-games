package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int SCORE_TO_WIN = 0;
    static final int RANDOM_MIN = 10;
    static final int RANDOM_MAX = 100;
    static final int ROUNDS_TO_WIN = 3;
    static final int INDEX = 3;
    private static int randomNumberMin;
    private static int randomNumberMax;
    private static Scanner userInput = new Scanner(System.in);

    public static int getIndex() {
        return INDEX;
    }
    public static int getScoreToWin() {
        return SCORE_TO_WIN;
    }
    public static int getRoundsToWin() {
        return ROUNDS_TO_WIN;
    }
    public static int getRandomNumberMin() {
        randomNumberMin = (int) (Math.random() * RANDOM_MIN);
        return randomNumberMin;
    }
    public static int getRandomNumberMax() {
        randomNumberMax = (int) (Math.random() * RANDOM_MAX);
        return randomNumberMax;
    }
    public static Scanner getUserInput() {
        return userInput;
    }
    public static String printWinnerText() {
        return "Congratulations, " + Cli.getName() + "!";

    }
    public static void printLooserText() {
        System.out.println("Let's try again, " + Cli.getName() + "!");
    }
    public static void printYourAnswer() {
        System.out.println("YourAnswer: ");
    }
    public static void printCorrect() {
        System.out.println("Correct!");
    }
}

