package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int WINNING_SCORE = 3;

    private static final int UPPER_BOUND = 100;

    public static void launchGame() {
        int counter = 0;
        int randomNumber;
        String userAnswer;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Answer 'yes' if a number is even otherwise answer 'no'.");
        while (counter != WINNING_SCORE) {
            randomNumber = random.nextInt(UPPER_BOUND);
            System.out.printf("""
                Question: %d
                Your answer:\s""", randomNumber);
            userAnswer = sc.nextLine();
            if (isAnswerCorrect(randomNumber, userAnswer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                printSadMessage(randomNumber, userAnswer);
                break;
            }
        }
        if (counter == WINNING_SCORE) {
            System.out.printf("Congratulations, %s!", Greet.getUsername());
        }
    }

    private static void printSadMessage(int number, String userAnswer) {
        String wrongAnswer = "yes";
        String correctAnswer = "no";
        if (isEven(number) && "no".equals(userAnswer)) {
            wrongAnswer = "no";
            correctAnswer = "yes";
        }
        System.out.printf("""
                %s is the wrong answer ;(. The correct answer was %s.
                Let's try again, %s!""", wrongAnswer, correctAnswer, Greet.getUsername());
    }

    private static boolean isAnswerCorrect(int number, String userAnswer) {
        return (isEven(number) && "yes".equals(userAnswer)) || (!isEven(number) && "no".equals(userAnswer));
    }


    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
