import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Add elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Access elements
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Remove an element
        arrayList.remove("Banana");

        // Iterate over the list
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
