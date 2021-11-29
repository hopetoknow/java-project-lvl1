package hexlet.code;

import java.util.Scanner;

public abstract class Engine {
    protected static final int WINNING_SCORE = 3;

    protected static final int UPPER_BOUND = 100;

    private String username;

    protected abstract void printHowToPlayMessage();

    protected abstract String getQuestion();

    protected abstract String getCorrectAnswer(String question);

    /**
     * Do not override if you're not sure what you're doing.
     */
    protected void launchGame() {
        greetUser();
        printHowToPlayMessage();
        showGameProgress();
    }

    protected final void greetUser() {
        System.out.print("""
                \nWelcome to the Brain Games!
                May I have your name?\s""");
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();
        System.out.printf("Hello, %s!\n", username);
    }

    private void showGameProgress() {
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

    private boolean isAnswerCorrect(String question, String userAnswer) {
        return getCorrectAnswer(question).equals(userAnswer);
    }

    private void printSadMessage(String wrongAnswer, String rightAnswer) {
        System.out.printf("""
                '%s' is the wrong answer ;(. The correct answer was '%s'.
                Let's try again, %s!
                """, wrongAnswer, rightAnswer, username);
    }

    private void printWinningMessage(int counter) {
        if (counter == WINNING_SCORE) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
}
