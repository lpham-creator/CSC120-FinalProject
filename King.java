import java.util.Hashtable;
import java.util.Random;

public class King {
    private Hashtable<String, String> questions;
    private Random rand;

    public King() {
        questions = new Hashtable<>();
        questions.put("What is the capital of France?", "Paris");
        questions.put("What is the highest mountain in the world?", "Mount Everest");
        questions.put("What is the largest mammal in the world?", "Blue Whale");
        rand = new Random();
    }

    public String getQuestion() {
        if (questions.size() == 0) {
            return null;
        }
        int index = rand.nextInt(questions.size());
        return (String) questions.keySet().toArray()[index];
    }

    public boolean askQuestion(String question, String answer) {
        String correctAnswer = questions.get(question);
        if (correctAnswer != null && correctAnswer.equals(answer)) {
            System.out.println("King: Correct! You may proceed.");
            return true;
        } else {
            System.out.println("King: Incorrect! You have angered me.");
            return false;
        }
    }
}
