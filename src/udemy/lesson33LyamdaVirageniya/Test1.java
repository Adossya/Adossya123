package udemy.lesson33LyamdaVirageniya;

import java.util.ArrayList;

public class Test1 {

}

//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    void printStudent(Student s) {
//        System.out.println("Imya studenta " + s.name + ", pol " + s.sex + ", vozrast " + s.age + ", kurs " + s.course + ", srednya ocenka" +
//                +s.avgGrade);
//    }
//
//    void printStudentOverGrade(ArrayList<Student> aL, double avgGrade) {
//        for (Student s : aL) {
//            if (s.avgGrade > avgGrade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentUnderGrade(ArrayList<Student> aL, double avgGrade) {
//        for (Student s : aL) {
//            if (s.avgGrade < avgGrade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentOverAge(ArrayList<Student> aL, int age) {
//        for (Student s : aL) {
//            if (s.avgGrade > age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> aL, int age) {
//        for (Student s : aL) {
//            if (s.avgGrade < age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentBySex(ArrayList<Student> aL, char sex) {
//        for (Student s : aL) {
//            if (s.sex== sex) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentMixCondishnc(ArrayList<Student> aL, double avgGrade, int age, char sex) {
//        for (Student s : aL) {
//            if (s.avgGrade>avgGrade && s.age<age && s.sex==sex) {
//                printStudent(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList <Student> list = new ArrayList<Student>();
//        Student s1=new Student("Ivan",'m',22,3,8.3);
//        Student s2=new Student("Nikolay",'m',28,2,6.4);
//        Student s3=new Student("Elena",'f',19,1,8.9);
//        Student s4=new Student("Petr",'m',35,4,7);
//        Student s5=new Student("Mariya",'f',23,3,9.1);
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        list.add(s5);
//        StudentInfo si=new StudentInfo();
//        si.printStudentOverGrade(list,8.5);
//        System.out.println("----------------------");
//        si.printStudentUnderGrade(list,9);
//        System.out.println("----------------------");
//        si.printStudentOverAge(list,25);
//        System.out.println("----------------------");
//        si.printStudentUnderAge(list,27);
//        System.out.println("----------------------");
//        si.printStudentBySex(list,'m');
//        System.out.println("----------------------");
//        si.printStudentMixCondishnc(list,7.2,23,'f');
//        System.out.println("______________________");
//        si.printStudent(s5);
//    }
//}

