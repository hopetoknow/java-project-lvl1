package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Greet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                Your choice:\s""");
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        try {
            Games game = Games.values()[gameNumber - 1];
            switch (game) {
                case GREET:
                    new Greet().greetUser();
                    break;
                case EVEN:
                    new Even().launchGame();
                    break;
                case CALC:
                    new Calc();
                    break;
                default:
                    break;
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }
}
