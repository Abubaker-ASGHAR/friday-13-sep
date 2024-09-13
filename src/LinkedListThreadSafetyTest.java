import java.util.LinkedList;
import java.util.List;

public class LinkedListThreadSafetyTest {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new LinkedList<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Size of list: " + list.size());
    }
}
