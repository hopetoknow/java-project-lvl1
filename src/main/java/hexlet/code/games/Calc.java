package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Calc extends Engine {
    private static final int UPPER_BOUND = 20;

    private static final int ASCII_CODE_OF_ASTERISK = 42;

    private static final int ASCII_CODE_OF_PLUS_SIGN = 43;

    private static final int ASCII_CODE_OF_HYPHEN = 45;

    @Override
    protected void printHowToPlayMessage() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    protected String getQuestion() {
        Random random = new Random();
        int firstRandomNumber = random.nextInt(UPPER_BOUND);
        int secondRandomNumber = random.nextInt(UPPER_BOUND);
        int[] randomArithmeticOperations = {ASCII_CODE_OF_ASTERISK, ASCII_CODE_OF_PLUS_SIGN, ASCII_CODE_OF_HYPHEN};
        int randomIndex = random.nextInt(randomArithmeticOperations.length);
        char arithmeticOperation = (char) randomArithmeticOperations[randomIndex];
        return firstRandomNumber + " " + arithmeticOperation + " " + secondRandomNumber;
    }

    @Override
    protected String getCorrectAnswer(String question) {
        String copyOfQuestion = question;
        String[] questionElements = copyOfQuestion.split("\s+");
        String arithmeticOperation = questionElements[1];
        int correctAnswer = 0;
        switch (arithmeticOperation) {
            case "+":
                correctAnswer = Integer.parseInt(questionElements[0]) + Integer.parseInt(questionElements[2]);
                break;
            case "-":
                correctAnswer = Integer.parseInt(questionElements[0]) - Integer.parseInt(questionElements[2]);
                break;
            case "*":
                correctAnswer = Integer.parseInt(questionElements[0]) * Integer.parseInt(questionElements[2]);
                break;
            default:
                break;
        }
        return String.valueOf(correctAnswer);
    }
}
