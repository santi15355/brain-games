

package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void getName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner playerInput = new Scanner(System.in);
        String name = playerInput.nextLine();
        System.out.println("Hello, " + name + "!");
        playerInput.close();
    }
}
