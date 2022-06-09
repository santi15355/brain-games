package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void gameRun(String gameQuestion, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner plaerInput = new Scanner(System.in);
        String name = plaerInput.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameQuestion);
        Scanner inputAnswer = new Scanner(System.in);

        for (var i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = inputAnswer.nextLine();
            if (userAnswer.equals(gameData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + gameData[i][1] + "'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

