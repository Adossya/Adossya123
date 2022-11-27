package udemyBlackBeltJava.multithreading;

public class Example9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread1 = new Thread(new Worker());
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
        thread1.join(); // cколько милисекунд ждет пока поработает поток и после 1.5с продолжит работу.
        System.out.println(thread1.getState());
        System.out.println("Method main ends");
    }
}

class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends");
    }
}
