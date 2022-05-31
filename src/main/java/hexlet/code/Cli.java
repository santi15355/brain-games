package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner userInput = new Scanner(System.in);
    private static String name;

    public static void greetUser() {
        name = askUser("Welcome to the Brain Games!\nMay I have your name? ");
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }

    public static String askUser(String question) {
        System.out.print(question);
        return userInput.nextLine();
    }
}
