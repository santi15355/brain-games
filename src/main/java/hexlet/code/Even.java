package hexlet.code;

import java.util.Scanner;
public class Even {
    public static void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var scoreToWin = 0;
        final var randomMax = 100;
        final var count = 3;
        final var timesToWin = 3;
        for (var i = 0; i < count; i++) {
            int randomNumber = (int) (Math.random() * randomMax);
            int isEven = randomNumber % 2;
            Scanner answerGameEven = new Scanner(System.in);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswerEven = answerGameEven.nextLine();
            userAnswerEven = userAnswerEven.toLowerCase();
            if ((isEven == 0 & userAnswerEven.equals("yes")) | (isEven != 0 & userAnswerEven.equals("no"))) {
                System.out.println("Correct!");
                scoreToWin++;
            } else {
                String yes = "'yes'";
                String no = "'no'";
                if (userAnswerEven.equals("yes")) {
                    System.out.println(yes + " is wrong answer ;(. Correct answer was " + no + ".");
                } else if (userAnswerEven.equals("no")) {
                    System.out.println(no + " is wrong answer ;(. Correct answer was " + yes + ".");
                }
                break;
            }
            if (scoreToWin == timesToWin) {
                System.out.println("Congratulations, " + Cli.getName() + "!");
            }
        }
    }
}
