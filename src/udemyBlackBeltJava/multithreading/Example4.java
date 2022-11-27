package udemyBlackBeltJava.multithreading;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("potok1");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("potok2");
            }
        }).start();
        new Thread (() -> System.out.println("potok3")).start();
    }


}
