package thread;

import org.junit.jupiter.api.Test;

public class ThreadTest {

    @Test
    public void testThread() {
        Thread thread1= new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        });
        Thread thread2= new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        });

        thread1.setName("Thread 1 ");
        thread2.setName("Thread 2 ");

        thread1.start();
        thread2.start();
    }
}
