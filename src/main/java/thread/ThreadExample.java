package thread;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println(this.getName() + "is running");
    }

    public static void main(String[] args) {
        Thread thread1= new ThreadExample();
        Thread thread2= new ThreadExample();

        thread1.setName("Thread 1 ");
        thread2.setName("Thread 2 ");

        thread1.start();
        thread2.start();
    }
}
