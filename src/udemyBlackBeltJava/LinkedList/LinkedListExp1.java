package udemyBlackBeltJava.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExp1 {
    public static void main(String[] args) {
        Student2 st1=new Student2("Lida",3);
        Student2 st2=new Student2("Poni",2);
        Student2 st3=new Student2("Ara",5);
        Student2 st4=new Student2("Madina",4);
        Student2 st5=new Student2("Luna",1);
        LinkedList<Student2> student2LinkedList= new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println(student2LinkedList);
        System.out.println(student2LinkedList.get(2));
        Student2 st6=new Student2("Vova",4);
        Student2 st7=new Student2("Evgeniy",3);
        student2LinkedList.add(st6);
        student2LinkedList.add(1,st7);
        System.out.println(student2LinkedList);
        student2LinkedList.remove(3);
        System.out.println(student2LinkedList);
//        ArrayList<Student2> arrayList2=new ArrayList<>();
//        arrayList2.add(st1);
//        arrayList2.add(st2);
//        arrayList2.add(st3);
//        arrayList2.add(st4);
//        arrayList2.add(st5);
//        System.out.println(arrayList2);
//        System.out.println(arrayList2.get(2));


    }
}


class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
