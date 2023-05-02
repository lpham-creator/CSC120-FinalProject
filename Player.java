import java.util.*;

/**
 * Represents a player in the Game of Thrills.
 */
public class Player {
    /* The name of the player */
    private String name;

    /* The age of the player */
    private int age;

    /* The total points of the player */
    public int totalPoints;

    /* The array list used to store the items */
    private ArrayList<String> items;

    /**
     * Constructs a new player.
     * Prompts the player to enter their name and age.
     * Initializes the player's items and total points to 0.
     */
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

        // Initialize the arraylist of items
        this.items = new ArrayList<String>();

        System.out.println("Your character name is " + name + " and your character's age is " + age +"! Your total point is " + totalPoints + ". Let's go! Entering the first round...");
    }

    /**
     * Returns the total points earned by the player.
     * @return the total points earned by the player
     */
    public int getTotalPoints() {
        return totalPoints;
    }

    /**
     * Adds an item to the player's list of items.
     * @param x the item to be added
     */
    public void addItems(String x) {
        this.items.add(x);
        System.out.print(x + " has been added to your list of items!");
    }

    /**
     * Checks if the player's list of items contains a certain item.
     * @param x the item to be checked
     * @return true if the item is in the list, false otherwise
     */
    public boolean containItems(String x){
        return this.items.contains(x);
    }

    /**
     * Removes an item from the player's list of items.
     * @param x the item to be removed
     */
    public void removeItem(String x){
        this.items.remove(x);
        System.out.print(x + " has been removed from your list of items.");
    }
}
