import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Map<String, Integer> hashtable = new Hashtable<>();

        // Add key-value pairs
        hashtable.put("X", 10);
        hashtable.put("Y", 20);
        hashtable.put("Z", 30);

        // Access a value
        System.out.println("Value for key 'Y': " + hashtable.get("Y"));

        // Remove a key-value pair
        hashtable.remove("Z");

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
