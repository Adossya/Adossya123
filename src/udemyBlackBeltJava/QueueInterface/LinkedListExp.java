package udemyBlackBeltJava.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExp {
    public static void main(String[] args) {
        Queue <String> queue=new LinkedList<>();
        queue.offer("Apelsin"); // тот же add

        queue.offer("Tomat");
        queue.offer("Kartoha");
        queue.offer("Limon");
        queue.offer("Mandarin");
        System.out.println(queue.remove("Limon"));
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll()); // тот же remove, но не выдаст ошибку
        System.out.println(queue.element());
        System.out.println(queue.peek()); // тот же element, но не выдаст error


    }
}
