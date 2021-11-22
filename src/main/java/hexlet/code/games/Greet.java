package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    public static String USERNAME;

    public static void greetUser() {
        System.out.print("""
                
                Welcome to the Brain Games!
                May I have your name?\s""");
        Scanner sc = new Scanner(System.in);
        USERNAME = sc.nextLine();
        System.out.printf("Hello, %s!\n", USERNAME);
    }
}
