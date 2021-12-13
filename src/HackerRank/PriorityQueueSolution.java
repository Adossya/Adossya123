package HackerRank;

import java.util.*;
import java.util.PriorityQueue;

public class PriorityQueueSolution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List <Student> getStudents=new ArrayList<Student>();


    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }

    @Override
    public int compareTo(Student anotherStd) {

        if (this.cgpa > anotherStd.cgpa){
            return 1;
        }
        else if (this.cgpa < anotherStd.cgpa){
            return -1;
        }
        else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", cgpa=" + cgpa + '}';
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.cgpa, cgpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cgpa);
    }
}

class  NameComparator implements Comparator <Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class  IdComparator implements Comparator <Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getID()-s2.getID();
    }
}


//class  CGPAComparator implements Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2) {
//         if (s1.getCGPA() > s2.getCGPA()){
//            return 1;
//        }
//        else if (s1.getCGPA()  < s2.getCGPA()){
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }
//}