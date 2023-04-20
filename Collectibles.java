import java.util.Hashtable;
import java.util.Random;

public class Collectibles {
    private Hashtable<String, Integer> items;
    private Random rand;

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
        items.put("Grand Prize", 5000);
        items.put("Rice Bag", -10);
        items.put("Rice Bag", -10);
        items.put("Rice Bag", -10);
        items.put("Rice Bag", -10);
        items.put("Cat Ears", 0);
        rand = new Random();
    }

    public int getItemValue(String item) {
        return items.get(item);
    }

    public String getRandomItem() {
        if (items.size() == 0) {
            return null;
        }
        int index = rand.nextInt(items.size());
        return (String) items.keySet().toArray()[index];
    }
}

