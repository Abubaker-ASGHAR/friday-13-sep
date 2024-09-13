class OuterClass {
    private String message = "Hello from OuterClass!";

    // Non-static inner class
    class InnerClass {
        void displayMessage() {
            System.out.println("Message from InnerClass: " + message); // Can access outer class members
        }
    }
}

public class NonstaticInnerClass{
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outer = new OuterClass();

        // Creating an instance of the inner class
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Calling the method of the inner class
        inner.displayMessage();
    }
}
