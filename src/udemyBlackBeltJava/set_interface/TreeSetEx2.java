package udemyBlackBeltJava.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Studen> ts1=new TreeSet<>();
        Studen st1=new Studen("Anton", 1);
        Studen st2=new Studen("Kolya", 3);
        Studen st3=new Studen("Papa", 4);
        Studen st4=new Studen("Masha", 5);
        Studen st5=new Studen("Ira", 3);
        Studen st6=new Studen("Oleg", 3);
        ts1.add(st1);
        ts1.add(st2);
        ts1.add(st3);
        ts1.add(st4);
        ts1.add(st5);
        System.out.println(ts1);
        System.out.println();
        System.out.println(ts1.first());
        System.out.println();
        System.out.println(ts1.last());
        System.out.println();
        System.out.println(ts1.headSet(st6));
        System.out.println();
        System.out.println(ts1.tailSet(st6));
        System.out.println();
        Studen st7=new Studen("Ilya", 2);
        Studen st8=new Studen("Ivan", 4);
        System.out.println(ts1.subSet(st7,st8));
        System.out.println();
        System.out.println(st2.equals(st5));
        System.out.println(st2.hashCode()==st6.hashCode());
        System.out.println(st2.hashCode());

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
