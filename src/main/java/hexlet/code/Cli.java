package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.printf("Hello, %s!\n", username);
    }
}