package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD extends Engine {

    @Override
    protected void printHowToPlayMessage() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    protected String getQuestion() {
        Random random = new Random();
        int firstRandomNumber = random.nextInt(UPPER_BOUND);
        int secondRandomNumber = random.nextInt(UPPER_BOUND);
        return firstRandomNumber + " "  + secondRandomNumber;
    }

    @Override
    protected String getCorrectAnswer(String question) {
        String copyOfQuestion = question;
        String[] questionElements = copyOfQuestion.split("\s+");
        int firstNumber = Integer.parseInt(questionElements[0]);
        int secondNumber = Integer.parseInt(questionElements[1]);
        int correctAnswer = getGCDByEuclideanAlgorithm(firstNumber, secondNumber);

        return String.valueOf(correctAnswer);
    }

    private int getGCDByEuclideanAlgorithm(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGCDByEuclideanAlgorithm(secondNumber, firstNumber % secondNumber);
    }
}
