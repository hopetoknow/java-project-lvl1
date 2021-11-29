package hexlet.code.games;

import hexlet.code.Engine;

public final class Greet extends Engine {
    @Override
    public void launchGame() {
        greetUser();
    }

    @Override
    protected void printHowToPlayMessage() {

    }

    @Override
    protected String getQuestion() {
        return null;
    }

    @Override
    protected String getCorrectAnswer(String question) {
        return null;
    }
}
