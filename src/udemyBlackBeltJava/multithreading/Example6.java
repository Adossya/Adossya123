package udemyBlackBeltJava.multithreading;

public class Example6 implements Runnable{

    public void run() {
        System.out.println("Method run, Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example6());
        thread.start();
        thread.run(); // нельзя так делать
    }
}
