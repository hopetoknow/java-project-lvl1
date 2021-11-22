package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void launchGame() {
        System.out.println("Answer 'yes' if a number is even otherwise answer 'no'.");
        int counter = 0;
        int randomNumber;
        String userAnswer;
        Random random = new Random();
        while (counter != 3) {
            System.out.printf("""                
                Question: %d
                Your answer:\s""", randomNumber = random.nextInt(100));
            Scanner sc = new Scanner(System.in);
            userAnswer = sc.nextLine();
            if (isAnswerCorrect(randomNumber, userAnswer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                printSadMessage(randomNumber, userAnswer);
                break;
            }
        }
        if (counter == 3) {
            System.out.printf("Congratulations, %s!", Greet.USERNAME);
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
                Let's try again, %s!""", wrongAnswer, correctAnswer, Greet.USERNAME);
    }

    private static boolean isAnswerCorrect(int number, String userAnswer) {
        return (isEven(number) && "yes".equals(userAnswer)) || (!isEven(number) && "no".equals(userAnswer));
    }


    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
