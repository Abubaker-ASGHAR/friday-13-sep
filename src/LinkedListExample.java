import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Add elements
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");

        // Access elements
        System.out.println("Element at index 2: " + linkedList.get(2));

        // Remove an element
        linkedList.remove("Cat");

        // Iterate over the list
        for (String animal : linkedList) {
            System.out.println(animal);
        }
    }
}
