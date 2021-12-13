package udemyBlackBeltJava.QueueInterface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExm2 {
    public static void main(String[] args) {
        PriorityQueue <Studen> priorityQueue=new PriorityQueue<>();
        Studen st1=new Studen("Anton", 1);
        Studen st2=new Studen("Kolya", 6);
        Studen st3=new Studen("Papa", 4);
        Studen st4=new Studen("Masha", 5);
        Studen st5=new Studen("Ira", 3);
        Studen st6=new Studen("Oleg", 3);

        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);


        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}

class Studen implements  Comparable <Studen>{
    String name;
    int course;

    @Override
    public int compareTo(Studen o) {
        return this.course-o.course;
    }

    @Override
    public String toString() {
        return "Studen{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studen studen = (Studen) o;
        return course == studen.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    public Studen(String name, int course) {
        this.name = name;
        this.course = course;


    }
}
