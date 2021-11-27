package hexlet.code;

import java.util.Scanner;

public abstract class Engine {
    protected static final int WINNING_SCORE = 3;

    private String username;

    public abstract void launchGame();

    protected abstract String getQuestion();

    protected abstract String getCorrectAnswer(String question);

    protected final void showGameProgress() {
        int counter = 0;
        String userAnswer;
        String rightAnswer;
        Scanner sc = new Scanner(System.in);
        while (counter != WINNING_SCORE) {
            String question = getQuestion();
            System.out.printf("""
                Question: %s
                Your answer:\s""", question);
            userAnswer = sc.nextLine();
            rightAnswer = getCorrectAnswer(question);
            if (isAnswerCorrect(question, userAnswer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                printSadMessage(userAnswer, rightAnswer);
                break;
            }
        }
        printWinningMessage(counter);
    }

    protected final boolean isAnswerCorrect(String question, String userAnswer) {
        return getCorrectAnswer(question).equals(userAnswer);
    }

    protected final void printSadMessage(String wrongAnswer, String rightAnswer) {
        System.out.printf("""
                '%s' is the wrong answer ;(. The correct answer was '%s'.
                Let's try again, %s!
                """, wrongAnswer, rightAnswer, getUsername());
    }

    protected final void printWinningMessage(int counter) {
        if (counter == WINNING_SCORE) {
            System.out.printf("Congratulations, %s!\n", getUsername());
        }
    }

    protected final void greetUser() {
        System.out.print("""
                \nWelcome to the Brain Games!
                May I have your name?\s""");
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();
        System.out.printf("Hello, %s!\n", username);
    }

    protected final String getUsername() {
        return username;
    }
}
