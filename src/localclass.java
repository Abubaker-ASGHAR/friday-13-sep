class OuterClass2 {
    void outerMethod() {
        final int number = 100;  // Local variable (must be final or effectively final)

        // Local inner class
        class LocalInnerClass {
            void displayNumber() {
                System.out.println("Number from LocalInnerClass: " + number);
            }
        }

        // Creating an instance of the local inner class and calling its method
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.displayNumber();
    }
}

public class localclass {
    public static void main(String[] args) {
        // Creating an instance of the outer class and calling the method
        OuterClass2 outer = new OuterClass2();
        outer.outerMethod();
    }
}
