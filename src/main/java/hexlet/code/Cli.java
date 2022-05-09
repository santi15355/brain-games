package hexlet.code;

import java.util.Scanner;
public class Cli {

    public static void userName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = userInput.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
