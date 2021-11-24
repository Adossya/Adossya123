package udemyBlackBeltJava.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExm1 {
    public static void main(String[] args) {
        Map<Student, Double> map1 = new HashMap<>();
        Student st1=new Student("Zaur","Tregulov",3);
        Student st2=new Student("Nikita","Boyko",2);
        Student st3=new Student("Vladimir","Zagakaylo",5);
        map1.put(st1,7.5);
        map1.put(st2,8.7);
        map1.put(st3,9.2);
        System.out.println(map1);

        Student st4=new Student("Zaur","Tregulov",3);
//        boolean result= map1.containsKey(st4);
//        System.out.println("result = "+result);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st4.hashCode() );
        System.out.println(st1.equals(st4));

        for (Map.Entry<Student,Double> entry: map1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}

class Student {
    String name;
    String suname;
    int course;

    public Student(String name, String suname, int course) {
        this.name = name;
        this.suname = suname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", suname='" + suname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(suname, student.suname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, suname, course);
    }
}
