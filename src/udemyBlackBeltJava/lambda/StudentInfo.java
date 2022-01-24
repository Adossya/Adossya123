package udemyBlackBeltJava.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;


class StudentInfooo {

    void testStudent (ArrayList<Student> al, Predicate <Student> pr){
        for (Student s:al){
            if (pr.test(s)){
                System.out.println(s);
            }
        }
    }
}
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
        StudentInfooo info=new StudentInfooo();
//        info.testStudent (students,new checkOvergrade());
        System.out.println("-----");
//        info.testStudent(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });

        info.testStudent(students,(Student s) -> {return s.age<30;});

        System.out.println("======");
        info.testStudent(students,(Student s)->{return s.avr_Grade>8;} );
        System.out.println("-----");
        info.testStudent(students,(Student s)->{
            return s.age>20 && s.avr_Grade<10 && s.sex=='m';
        });
//        info.printStudentsOverGrade(students,8);
//        System.out.println("++++++++");
//        info.printStudentsUnderrGrade(students,20);
//        System.out.println("++++++++");
//        info.printStudentsMixCondition(students,17,7,'f');

    }
//    void printStudentsOverGrade (ArrayList <Student> al, double avr_Grade){
//        for (Student s:al){
//            if (s.avr_Grade>avr_Grade){
//            System.out.println(s);}
//        }
//    }
//    void printStudentsUnderrGrade (ArrayList <Student> al, int age){
//        for (Student s:al){
//            if (s.age<age){
//                System.out.println(s);}
//        }
//    }
//    void printStudentsMixCondition (ArrayList <Student> al, int age, double grade, char sex){
//        for (Student s:al){
//            if (s.age>age && s.avr_Grade<grade && s.sex==sex){
//                System.out.println(s);}
//        }
//    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}



//class checkOvergrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avr_Grade>8;
//    }
//}