import java.util.Hashtable;
import java.util.Random;

/**
 * The Collectibles class represents a collection of items that can be obtained in a game.
 */
public class Collectibles {
    /* This is a hashtable used to store the items and their corresponding point values in the game */
    private Hashtable<String, Integer> items;

    /* A random object to randomly pick an item for the traveller */
    private Random rand;


    /**
     * Constructs a Collectibles object and initializes it with a set of predefined items.
     */
    public Collectibles() {
        items = new Hashtable<>();
        items.put("Sword", 10);
        items.put("Sword", 10);
        items.put("Sword", 10);
        items.put("Sword", 10);
        items.put("Sword", 10);
        items.put("Sword", 10);
        items.put("Sword", 10);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Mirror", 5);
        items.put("Shield", 15);
        items.put("Shield", 15);
        items.put("Shield", 15);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Love Potion", 30);
        items.put("Grand Prize", 5000);
        items.put("Rice Bag", -10);
        items.put("Rice Bag", -10);
        items.put("Rice Bag", -10);
        items.put("Rice Bag", -10);
        items.put("Cat Ears", 0);
        rand = new Random();
    }

    /**
     * A method which gets the value of the item
     * @param item
     * @return int
     */
    public int getItemValue(String item) {
        return items.get(item);
    }

    /**
     * A method which returns a random item from the collectibles
     * @return String item
     */
    public String getRandomItem() {
        if (items.size() == 0) {
            return null;
        }
        int index = rand.nextInt(items.size());
        return (String) items.keySet().toArray()[index];
    }
}

