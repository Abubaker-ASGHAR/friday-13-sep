class OuterClass3 {
    void greet() {
        // Anonymous inner class implementing Runnable interface
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        // Running the anonymous class implementation
        r.run();
    }
}

public class anonymousclass {
    public static void main(String[] args) {
        // Creating an instance of the outer class and calling the method
        OuterClass3 outer = new OuterClass3();
        outer.greet();
    }
}
