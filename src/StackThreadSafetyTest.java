import java.util.Stack;

public class StackThreadSafetyTest {
    public static void main(String[] args) throws InterruptedException {
        Stack<Integer> stack = new Stack<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                stack.push(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Size of stack: " + stack.size());
    }
}
