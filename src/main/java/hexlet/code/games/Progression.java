package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Progression extends Engine {
    private static final int UPPER_BOUND = 20;

    private static final int NUMBER_OF_MEMBERS = 10;

    @Override
    protected void printHowToPlayMessage() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    protected String getQuestion() {
        Random random = new Random();
        int firstNumberOfProgression = random.nextInt(UPPER_BOUND);
        int commonDifference = 1 + random.nextInt(UPPER_BOUND);
        int indexOfHiddenElement = random.nextInt(NUMBER_OF_MEMBERS);
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < NUMBER_OF_MEMBERS; i++) {
            if (i == indexOfHiddenElement) {
                question.append(".. ");
                firstNumberOfProgression += commonDifference;
                continue;
            }
            question.append(firstNumberOfProgression).append(" ");
            firstNumberOfProgression += commonDifference;
        }
        return question.toString();
    }

    @Override
    protected String getCorrectAnswer(String question) {
        String copyOfQuestion = question;
        String[] questionElements = copyOfQuestion.split("\s+");
        int correctAnswer = 0;
        int commonDifference;
        for (int i = 0; i < questionElements.length; i++) {
            if ("..".equals(questionElements[i])) {
                if (i == 0) {
                    commonDifference = Integer.parseInt(questionElements[i + 2])
                            - Integer.parseInt(questionElements[i + 1]);
                    correctAnswer = Integer.parseInt(questionElements[i + 1]) - commonDifference;
                    break;
                }
                if (i == questionElements.length - 1) {
                    commonDifference = Integer.parseInt(questionElements[i - 1])
                            - Integer.parseInt(questionElements[i - 2]);
                    correctAnswer = Integer.parseInt(questionElements[i - 1]) + commonDifference;
                    break;
                }
                commonDifference = (Integer.parseInt(questionElements[i + 1])
                        - Integer.parseInt(questionElements[i - 1])) / 2;
                correctAnswer = Integer.parseInt(questionElements[i - 1]) + commonDifference;
                break;
            }
        }
        return String.valueOf(correctAnswer);
    }
}
