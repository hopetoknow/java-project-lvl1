package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Greet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        switch (gameNumber) {
            case 1:
                Greet.greetUser();
                break;
            case 2:
                Greet.greetUser();
                Even.launchGame();
                break;
            default:
                break;
        }
    }
}
