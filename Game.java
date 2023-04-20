import java.util.*;

public class Game {
  private static final int POINTS_TO_WIN = 200;
  private static final int QUESTIONS_PER_ROUND = 1;
  private int totalPoints;
  private int GoldCoins;
  private Player player;
  private int round;

  public Game() {
    Player player = new Player();
    totalPoints = 0;
    GoldCoins = 0;
    round = 1;
  }

  public void start() {
    Scanner scanner = new Scanner(System.in);

    for (int round = 1; round < 4; round++) {
      if (round == 1) {
        System.out.println("Round 1 begins! In this round, you will go through the Deadly Dessert to finish your quest. Which reward are waiting for our courage warrior? Muahahahaha...");
      } else if (round == 2) {
        System.out.println("Round 2 begins! Welcome to the Lake of Love, a romantic land where poets and lovers come to find inspiration and passion. Are you ready for the challenges in this charming land?");
      } else {
        System.out.println("Drum roll for the last round! Welcome to the Ice Land, a notoriously dangerous icy kingdom where survival is the ultimate goal. As you step onto the frozen terrain, you can feel the bitter cold piercing through your skin. Beware! Dangers await...");
      }
      int pointsForRound = 0;

      for (int i = 1; i <= QUESTIONS_PER_ROUND; i++) {
        System.out.println("Choose your quest:");

        if (round == 1) {
          System.out.println("1. Go North to help the farmers in their kumquat harvest! It's going to be hottttt. Your reward is: 30 gold coins & 100 points!");
          System.out.println("2. Go South to help our favorite painter - Michelangulu - finish his fresco for the church! That's noble work for sure. Your reward is: 100 gold coins & 30 points!");
          System.out.println("3. Collect items in the Sahawaii dessert! You will lose 100 points for this quest, but you have a chance of finding a Grand Treasure of 5000 points!");

          int questChoice = scanner.nextInt();
          if (questChoice == 1) {
            System.out.println("You chose Quest 1! Have fun harvesting!");
            System.out.println("Swoosh swoosh swoosh! The farmers in this village have 4 arms, so they are twice as fast!");
            pointsForRound += 100;
            totalPoints += 100;
            GoldCoins += 30;
          } else if (questChoice == 2) {
            System.out.println("You chose Quest 2! Let's go artsyyyy!");
            System.out.println("Paint paint paint...");
            pointsForRound += 30;
            totalPoints += 30;
            GoldCoins += 100;
          } else if (questChoice == 3) {
            System.out.println("You chose Quest 3! Have fun collecting!");
            Collectibles collector = new Collectibles();
            String randomItem = collector.getRandomItem();
            if (randomItem != null) {
              int itemValue = collector.getItemValue(randomItem);
              System.out.println("You found a " + randomItem + " worth " + itemValue + " points!");
            } else {
              System.out.println("No items found.");
            }
            pointsForRound += collector.getItemValue(randomItem);
            totalPoints += collector.getItemValue(randomItem);
            GoldCoins += 0;

          }
        } else if (round == 2) {
          System.out.println("1. The King of this area loves to talk to courageous young Warriors! Join him for a tea time to win a prize of 300 points if you make him happy! Else, you will have to go back to round 1 and lose all your points.");
          System.out.println("2. Go catsitting for our graceful princess! Your reward is: A kiss & 20 points!");

          int questChoice = scanner.nextInt();
          if (questChoice == 1) {
            System.out.println("You chose Quest 1! Go change into a beautiful outfit to enjoy the tea with our King.");
            King king = new King();
            Scanner scanner2 = new Scanner(System.in);

            System.out.println("King: Welcome, traveler! Answer my question correctly to pass through.");
            String question = king.getQuestion();
            System.out.println("King: " + question);

            String answer = scanner2.nextLine();
            boolean isAnswerCorrect = king.askQuestion(question, answer);
            if (isAnswerCorrect) {
              System.out.println("Congratulations! You may pass through.");
              pointsForRound += 300;
              totalPoints += 300;
              GoldCoins += 50;
            } else {
              System.out.println("You have been banished!");
              pointsForRound += 0;
              totalPoints += 0;
              GoldCoins += 0;
              round = 1;
            }
          } else if (questChoice == 2) {
            System.out.println("You chose Quest B!");
            pointsForRound += 20;
          } else {
            System.out.println("Invalid choice, try again!");
            i--; // Decrement the loop counter to repeat the current question
          }
          scanner.nextLine();
        } else {
          System.out.println("1. Quest A");
          System.out.println("2. Quest B");

          int questChoice = scanner.nextInt();
          if (questChoice == 1) {
            System.out.println("You chose Quest A!");
            pointsForRound += 50;
          } else if (questChoice == 2) {
            System.out.println("You chose Quest B!");
            pointsForRound += 100;
          } else {
            System.out.println("Invalid choice, try again!");
            i--; // Decrement the loop counter to repeat the current question
          }
          scanner.nextLine();
        }
      }

      System.out.println("Round ended. You scored " + pointsForRound + " points!");
      totalPoints += pointsForRound;

      if (round == 3 && totalPoints >= POINTS_TO_WIN) {
        System.out.println("Congratulations! You won the game with " + totalPoints + " points! Your reward is: Cold pudding!");
        return;
      }
    }

    System.out.println("Sorry, you lost the game. Better luck next time!");
  }

}