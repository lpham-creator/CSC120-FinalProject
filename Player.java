import java.util.Scanner;

public class Player {
    private String name;
    private int age;
    public int GoldCoins;
    public int totalPoints;
    
    public Player() {
        System.out.println("Welcome to the Game of Thrills! First, let's build a terrific character for this adventure!");
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the player to enter their name
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        
        // Prompt the player to enter their age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        System.out.println("Your character name is " + name + " and your character's age is " + age +"! Your total point is " + totalPoints + ". " + "Your total number of gold coins right now is " + GoldCoins + " coins. Let's go! Entering the first round...");
    }
    public int getTotalPoints() {
        return totalPoints;
    }

    public int getGoldCoins() {
        return GoldCoins;
    }
}



