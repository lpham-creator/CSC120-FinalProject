import java.util.*;

public class Player {
    private String name;
    private int age;
    public int totalPoints;
    private ArrayList < String > items;
    
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

        //Initialize the arraylist of items
        this.items = new ArrayList < String > ();

        System.out.println("Your character name is " + name + " and your character's age is " + age +"! Your total point is " + totalPoints + ". Let's go! Entering the first round...");
    }
    public int getTotalPoints() {
        return totalPoints;
    }

    public void addItems(String x) {
        this.items.add(x);
        System.out.print(x + " has been added to your list of items!");
    }

    public boolean containItems(String x){
        return this.items.contains(x);
    }

    public void removeItem(String x){
            this.items.remove(x);
            System.out.print(x + " has been removed from your list of items.");

}
}



