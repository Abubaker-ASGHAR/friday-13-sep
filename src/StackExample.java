import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Pop an element
        System.out.println("Popped element: " + stack.pop());

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Iterate over the stack
        for (String item : stack) {
            System.out.println(item);
        }
    }
}
