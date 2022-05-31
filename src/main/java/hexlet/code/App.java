package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 Exit
                """);
        Scanner gameNumber = new Scanner(System.in);
        System.out.print("Your choice: ");
        switch (gameNumber.nextLine()) {
            case "1":
                Cli.greetUser();
                break;
            case "2":
                Cli.greetUser();
                Even.evenGame();
                break;
            case "3":
                Cli.greetUser();
                Calc.calcGame();
                break;
            case "4":
                Cli.greetUser();
                GCD.gcdGame();
                break;
            case "5":
                Cli.greetUser();
                Progression.progressionGame();
                break;
            case "6":
                Cli.greetUser();
                Prime.primeGame();
                break;
            default:
                break;
        }
    }
}
