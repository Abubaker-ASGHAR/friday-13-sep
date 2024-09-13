import java.util.Vector;
import java.util.List;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        List<String> vector = new Vector<>();

        // Add elements
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");

        // Access elements
        System.out.println("Element at index 0: " + vector.get(0));

        // Remove an element
        vector.remove("Green");

        // Iterate over the list
        for (String color : vector) {
            System.out.println(color);
        }
    }
}
