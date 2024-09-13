import java.util.Vector;

public class VectorThreadSafetyTest {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Size of vector: " + vector.size());
    }
}
