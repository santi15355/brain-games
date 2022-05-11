package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String greeting = "Welcome to the Brain Games!";
        Scanner gameNumber = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n1 - Greet \n2 - Even \n0 - Exit");
        int gameSelect = gameNumber.nextInt();
        System.out.println("Your choice: " + gameSelect);
        switch (gameSelect) {
            case 1:
                System.out.println(greeting);
                Cli.userName();
                break;
            case 2:
                System.out.println(greeting);
                Cli.userName();
                Even.evenGame();
                break;
            default:
                break;
        }
    }
}
