import java.util.*;

public class Game {
  private static final int POINTS_TO_WIN = 500;
  private static final int QUESTIONS_PER_ROUND = 1;
  private Player player;
  private int pointsForRound1 = 0;
  private int pointsForRound2 = 0;
  private int pointsForRound3 = 0;

  public Game() {
    this.player = new Player();
    this.pointsForRound1 = 0;
    this.pointsForRound2 = 0;
    this.pointsForRound3 = 0;
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

      for (int i = 1; i <= QUESTIONS_PER_ROUND; i++) {
        System.out.println("Choose your quest:");

        if (round == 1) {
          System.out.println("1. Go North to help the farmers in their kumquat harvest! It's going to be hottttt. Your reward is: 100 points!");
          System.out.println("2. Go South to help our favorite painter - Michelangulu - finish his fresco for the church! That's noble work for sure. Your reward is: 100 points!");
          System.out.println("3. Collect items in the Sahawaii dessert! You will lose 100 points for this quest, but you have a chance of finding a Grand Treasure of 5000 points!");

          int questChoice = scanner.nextInt();
          if (questChoice == 1) {
            System.out.println("You chose Quest 1! Have fun harvesting!");
            System.out.println("Swoosh swoosh swoosh! The farmers in this village have 4 arms, so they are twice as fast!");
            pointsForRound1 += 100;
            player.totalPoints += 100;
            System.out.println("Round 1 has ended! You gained " + pointsForRound1 + " points!");
          } else if (questChoice == 2) {
            System.out.println("You chose Quest 2! Let's go artsyyyy!");
            System.out.println("Paint paint paint...");
            pointsForRound1 += 100;
            player.totalPoints += pointsForRound1;
            System.out.println("Round 1 has ended! You gained " + pointsForRound1 + " points!");
          } else if (questChoice == 3) {
            System.out.println("You chose Quest 3! Have fun collecting!");
            Collectibles collector = new Collectibles();
            String randomItem = collector.getRandomItem();
            int itemValue = collector.getItemValue(randomItem);
            if (randomItem != null) {
              System.out.println("You found a " + randomItem + " worth " + itemValue + " points!");
              player.totalPoints += itemValue;
              player.addItems(randomItem);

            } else {
              System.out.println("No items found.");
            }
            System.out.println();
            System.out.println("Do you want to keep this item? Enter 1 if you want to keep it, 2 if you want to drop the item.");
            Scanner scanner3 = new Scanner(System.in);
            
            // Prompt the player to enter their answer
            System.out.print("Enter your answer: ");
            int answer = scanner3.nextInt();
    
            //If-else statement 
            if (answer == 1) {
                System.out.print("Gotcha! You can keep " + randomItem);
            } else if (answer == 2) {
                player.removeItem(randomItem);
                player.totalPoints -= itemValue;
                pointsForRound1 -= itemValue;
            } else{
                System.out.print("Invalid answer. Please try again!");
            }
            System.out.println();
            pointsForRound1 += collector.getItemValue(randomItem);
            player.totalPoints += pointsForRound1;
            System.out.println("Round 1 has ended! You gained " + pointsForRound1 + " points!");

          }
        } else if (round == 2) {
          System.out.println("1. The King of this area loves to talk to courageous young Warriors! Join him for a tea time to win a prize of 300 points if you make him happy! Else, you will have to go back to round 1 and lose all your points.");
          System.out.println("2. (Only available to players with Love Potion) Go catsitting for our graceful princess! Your reward is: A kiss & 300 points!");

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
              pointsForRound2 += 300;
              player.totalPoints += pointsForRound2;
            } else {
              System.out.println("You have been banished!");
              pointsForRound2 += 0;
              player.totalPoints += 0;
            }
            System.out.println("Round 2 has ended! You gained " + pointsForRound2 + " points!");
          } else if (questChoice == 2 && player.containItems("Love Potion")) {
            System.out.println("You chose Quest 2! Have fun catsitting for our beautiful princess!");
            pointsForRound2 += 300;
            player.totalPoints += 300;
            System.out.println("Round 2 has ended! You gained " + pointsForRound2 + " points!");}
            else {
            throw new IllegalArgumentException("You don't have the Love Potion!");
          }
          scanner.nextLine();

        } else {
          System.out.println("1. Science");
          System.out.println("2. Arts");

          int questChoice = scanner.nextInt();
          if (questChoice == 1) {
            System.out.println("You chose Science Quest! Listen carefully: If a train is traveling at a speed of 60 miles per hour, and it takes 3 hours to travel from point A to point B, how far apart are point A and point B?");

            Scanner scanner4 = new Scanner(System.in);
            System.out.print("Enter your answer: ");
            int answer = scanner4.nextInt();
            if (answer == 180) {
              pointsForRound3 += 250;
              player.totalPoints += 250;
              System.out.print("That's correct! What a smart adventurer.");
              System.out.println();
            } else {
              System.out.print("Wrong!");
              System.out.println();
            }
            System.out.println("Round 3 has ended! You gained " + pointsForRound3 + " points!");
          } else if (questChoice == 2) {
            System.out.println("You chose the Arts Quest! Listen carefully: What is Dali's art style?");
            
            Scanner scanner5 = new Scanner(System.in);
            System.out.print("Enter your answer: ");
            String answer = scanner5.nextLine();
            if (answer == "The Persistence of Memory") {
              pointsForRound3 += 250;
              player.totalPoints += 250;
              System.out.print("That's correct! What a smart adventurer.");
              System.out.println();
            } else {
              System.out.print("Wrong!");
              System.out.println();
            }
            System.out.println("Round 3 has ended! You gained " + pointsForRound3 + " points!");
          } else {
            System.out.println("Invalid choice, try again!");
            i--; // Decrement the loop counter to repeat the current question
          }
          scanner.nextLine();
        }
      }

      if (round == 3 && player.totalPoints >= POINTS_TO_WIN) {
        System.out.println("Congratulations! You won the game with " + player.getTotalPoints() + " points! Your reward is: Cold pudding!");
        return;
      }
    }

    System.out.println("Sorry, you lost the game with " + player.getTotalPoints() + " points. Better luck next time!");
  }
  public static void main(String[] args) {
    Game game = new Game();
    game.start();
}

}
