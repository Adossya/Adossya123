package udemyBlackBeltJava.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

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
        private static  double avgOfSmt (List<Student> list, Function<Student,Double> f){
            double result=0;
//            list.forEach(std-> {
//                result += f.apply(std);
//            };);
            for (Student st:list){
                result+=f.apply(st);
            }
            result = result/list.size();
            return result;
        }

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

        double res=avgOfSmt(students, strr -> strr.avr_Grade);
        System.out.println("Sredn9ya ocenka: "+res);
        double res1=avgOfSmt(students, strr -> (double)strr.course);
        System.out.println("Sredniy course: "+res1);
        double res2=avgOfSmt(students, strr -> (double)strr.age);
        System.out.println("Sredniy vozrast: "+res2);





//        Function<Student, double> f= (Student s)-> {return 3.14;};

//      info.testStudent (students,new checkOvergrade());
//        System.out.println("-----");
//        info.testStudent(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
//
//        Predicate <Student> p1=(Student sb1) -> {return sb1.avr_Grade >7.5;};
//        Predicate <Student> p2=(Student sb1) -> {return sb1.sex == 'm';};
////      info.testStudent(students,p1);
////      info.testStudent(students,p2);
////      info.testStudent(students,p1.and(p2)); // объединить две проверки
////      info.testStudent(students,p1.or(p2));
//        info.testStudent(students, p1.negate()); // отрицать принципы p1 , выведуться все что выше 7.5
//
////        info.testStudent(students,(Student s) -> {return s.age<30;});
////
////        System.out.println("======");
////        info.testStudent(students,(Student s)->{return s.avr_Grade>8;} );
////        System.out.println("-----");
//        info.testStudent(students,(Student s)->{
//            return s.age>20 && s.avr_Grade<10 && s.sex=='m';
//        });
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