package hexlet.code.games;

import java.util.Scanner;

public final class Greet {
    public String greetUser() {
        System.out.print("""
                \nWelcome to the Brain Games!
                May I have your name?\s""");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.printf("Hello, %s!\n", username);
        return username;
    }
}
