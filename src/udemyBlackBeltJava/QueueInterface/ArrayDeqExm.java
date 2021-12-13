package udemyBlackBeltJava.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeqExm {
    public static void main(String[] args) {
        Deque <Integer> deque=new ArrayDeque<>();
        deque.add(10);
        deque.offerFirst(20);
        deque.offerLast(40);
        deque.addLast(5);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst()); // не выбрасывает Exception по сравнению с get
        System.out.println(deque.peekLast()); // не выбрасывает Exception по сравнению с get
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
    }
}
