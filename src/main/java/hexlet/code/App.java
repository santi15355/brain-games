package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final var one = 1;
        final var two = 2;
        final var three = 3;
        final var four = 4;
        String greeting = "Welcome to the Brain Games!";
        Scanner gameNumber = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n1 - Greet \n2 - Even \n3 - Calc");
        System.out.println("4 - GCD \n0 - Exit");
        int gameSelect = gameNumber.nextInt();
        System.out.println("Your choice: " + gameSelect);
        System.out.println();
        switch (gameSelect) {
            case one:
                System.out.println(greeting);
                Cli.userName();
                break;
            case two:
                System.out.println(greeting);
                Cli.userName();
                Even.evenGame();
                break;
            case three:
                System.out.println(greeting);
                Cli.userName();
                Calc.calcGame();
                break;
            case four:
                System.out.println(greeting);
                Cli.userName();
                GCD.gcdGame();
            default:
                break;
        }
    }
}
