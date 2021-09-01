package udemy.lesson33LyamdaVirageniya;

import java.util.ArrayList;

public class Test2 {

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
//
//class StudentInfo1 {
//    void printStudent(Student s) {
//        System.out.println("Imya studenta " + s.name + ", pol " + s.sex + ", vozrast " + s.age + ", kurs " + s.course + ", srednya ocenka" +
//                +s.avgGrade);
//    }
//
//    void testStudent(ArrayList<Student> aL, StudentChecks sc) {
//        for (Student s : aL) {
//            if (sc.testStudent(s)) {
//                printStudent(s);
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<Student>();
//        Student s1 = new Student("Ivan", 'm', 22, 3, 8.3);
//        Student s2 = new Student("Nikolay", 'm', 28, 2, 6.4);
//        Student s3 = new Student("Elena", 'f', 19, 1, 8.9);
//        Student s4 = new Student("Petr", 'm', 35, 4, 7);
//        Student s5 = new Student("Mariya", 'f', 23, 3, 9.1);
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        list.add(s5);
//        StudentInfo1 si=new StudentInfo1();
//        FindStudentsOverGrade fsog=new FindStudentsOverGrade ();
//        si.testStudent(list,fsog);
//
//    }
//}
//
//interface StudentChecks {
//    boolean testStudent(Student s);
//}
//
//class FindStudentsOverGrade implements StudentChecks {
//    public boolean testStudent(Student s) {
//        return s.avgGrade > 8.5;
//    }
//}
