class OuterClass1 {
    static String greeting = "Hello from Static Nested Class!";

    // Static nested class
    static class StaticNestedClass {
        void displayGreeting() {
            System.out.println("Greeting: " + greeting); // Can only access static members of the outer class
        }
    }
}

public class staticclass {
    public static void main(String[] args) {
        // No need to create an instance of the outer class
        OuterClass1.StaticNestedClass nested = new OuterClass1.StaticNestedClass();

        // Calling the method of the static nested class
        nested.displayGreeting();
    }
}
