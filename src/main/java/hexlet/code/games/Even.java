package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public final class Even {
    private static final int WINNING_SCORE = 3;

    private static final int UPPER_BOUND = 100;

    public void launchGame(String username) {
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
                printSadMessage(randomNumber, username, userAnswer);
                break;
            }
        }
        if (counter == WINNING_SCORE) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }

    private void printSadMessage(int number, String username, String userAnswer) {
        String wrongAnswer = null;
        String correctAnswer = null;
        if (isEven(number)) {
            correctAnswer = "yes";
            wrongAnswer = "no";
            if (!"no".equals(userAnswer)) {
                wrongAnswer = userAnswer;
            }
        } else if (!isEven(number)) {
            correctAnswer = "no";
            wrongAnswer = "yes";
            if (!"yes".equals(userAnswer)) {
                wrongAnswer = userAnswer;
            }
        }
        System.out.printf("""
                %s is the wrong answer ;(. The correct answer was %s.
                Let's try again, %s!
                """, wrongAnswer, correctAnswer, username);
    }

    private boolean isAnswerCorrect(int number, String userAnswer) {
        return (isEven(number) && "yes".equals(userAnswer)) || (!isEven(number) && "no".equals(userAnswer));
    }


    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
