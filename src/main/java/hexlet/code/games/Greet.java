package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    private static String username;

    public static void greetUser() {
        System.out.print("""
                \nWelcome to the Brain Games!
                May I have your name?\s""");
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();
        System.out.printf("Hello, %s!\n", username);
    }

    public static String getUsername() {
        return username;
    }
}
