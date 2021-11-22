package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                0 - Exit
                Your choice:\s""");
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        if (gameNumber == 1) {
            Cli.greetUser();
        }
    }
}
