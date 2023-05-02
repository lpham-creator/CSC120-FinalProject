import java.util.Hashtable;
import java.util.Random;

/**
 * The King class represents a game in which the player must answer questions asked by the king.
 * The questions are stored in a Hashtable, and the player must answer correctly to proceed.
 */
public class King {
    
    /* A Hashtable which stores the questions and their correct answers */
    private Hashtable<String, String> questions; 

    /* A random object which is used to generate a random question */
    private Random rand; 

    /**
     * Constructor for King class.
     * Initializes the questions Hashtable with some sample questions and answers.
     * Also initializes the Random object.
     */
    public King() {
        questions = new Hashtable<>();
        questions.put("What is the capital of France?", "Paris");
        questions.put("What is the highest mountain in the world?", "Mount Everest");
        questions.put("What is the largest mammal in the world?", "Blue Whale");
        rand = new Random();
    }

    /**
     * Gets a random question from the questions Hashtable.
     * @return a String representing the question
     */
    public String getQuestion() {
        if (questions.size() == 0) {
            return null;
        }
        int index = rand.nextInt(questions.size());
        return (String) questions.keySet().toArray()[index];
    }

    /**
     * Asks the player a question and checks if their answer is correct.
     * @param question a String representing the question
     * @param answer a String representing the player's answer
     * @return true if the answer is correct, false otherwise
     */
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
