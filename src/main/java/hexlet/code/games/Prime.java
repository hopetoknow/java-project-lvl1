package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Prime extends Engine {
    @Override
    protected void printHowToPlayMessage() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
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
        if (isPrime(number)) {
            return "yes";
        } else {
            return "no";
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
