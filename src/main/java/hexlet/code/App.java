package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Greet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit
                Your choice:\s""");
        Scanner sc = new Scanner(System.in);
        try {
            int gameNumber = sc.nextInt();
            Games game = Games.values()[gameNumber - 1];
            switch (game) {
                case GREET:
                    new Greet().launchGame();
                    break;
                case EVEN:
                    new Even().launchGame();
                    break;
                case CALC:
                    new Calc().launchGame();
                    break;
                case GCD:
                    new GCD().launchGame();
                    break;
                default:
                    break;
            }
        } catch (IndexOutOfBoundsException  | InputMismatchException e) {
            System.out.println("Pay attention, all right? Check what you typed.");
        }
    }
}
