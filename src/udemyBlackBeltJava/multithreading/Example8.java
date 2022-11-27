package udemyBlackBeltJava.multithreading;

public class Example8 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Example8 thread1 = new Example8();
        Thread thread2 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();

        thread1.join(); // метод мейн ждет окончания работы потока1
        thread2.join();
        System.out.println("Konec !!!");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
