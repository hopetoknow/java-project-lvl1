package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public final class Even extends Engine {
    private static final int UPPER_BOUND = 100;

    @Override
    public void launchGame() {
        greetUser();
        System.out.println("Answer 'yes' if a number is even otherwise answer 'no'.");
        showGameProgress();
    }

    @Override
    protected String getQuestion() {
        Random random = new Random();
        int randomNumber = random.nextInt(UPPER_BOUND);
        return String.valueOf(randomNumber);
    }

    @Override
    protected String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        if (isEven(number)) {
            return "yes";
        } else {
            return "no";
        }
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
