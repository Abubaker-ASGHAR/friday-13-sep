import java.util.ArrayList;
import java.util.List;

public class ArrayListThreadSafetyTest {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t3.start();
        t4.start();

        t3.join();
        t4.join();
        System.out.println("Size of list: " + list.size());
    }
}
