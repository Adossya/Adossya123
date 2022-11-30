package udemyBlackBeltJava.multithreading;

public class Example10 {
    public static void main(String[] args) {
        MyRunnambleImpl runnamble = new MyRunnambleImpl();
        Thread thread1 = new Thread(runnamble);
        Thread thread2 = new Thread(runnamble);
        Thread thread3 = new Thread(runnamble);
        thread1.start();
        System.out.println(thread1.getName());
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;

}

class MyRunnambleImpl implements Runnable{
    public synchronized void  increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    @Override
    public void run() {
        for (int i = 0; i<3; i++){
            increment();
        }
    }
}