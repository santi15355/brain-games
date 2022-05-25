package hexlet.code;

import java.util.Scanner;
public class Cli {
    private static String name;
    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        Scanner userInput = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = userInput.nextLine();
        System.out.println("Hello, " + name + "!");
    }
    public static String getName() {
        return name;
    }
}
