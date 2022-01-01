package udemyBlackBeltJava.lambda;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1=new Student("Ivan",'m',22,6,8.3);
        Student st2=new Student("Kolya",'m',18,2,3.3);
        Student st3=new Student("Masha",'f',19,3,5.3);
        Student st4=new Student("Vasya",'m',17,1,1.5);
        Student st5=new Student("Ilya",'m',18,2,10.4);
        ArrayList <Student> students=new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

    }
    void printStudentsOverGrade (ArrayList <Student> al, double avr_Grade){}
    void printStudentsUnderrGrade (ArrayList <Student> al, int age){}
    void printStudentsOGrade (ArrayList <Student> al, double avr_Grade){}
}
