import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs
        treeMap.put("Cherry", 3);
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);

        // Access a value
        System.out.println("Value for key 'Apple': " + treeMap.get("Apple"));

        // Remove a key-value pair
        treeMap.remove("Banana");

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

