package udemy.lesson12;

import udemy.Lesson11.Student;



public class StudentTest {

    public static void sravnenieStudentov(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && (st1.course == st2.course) && (st1.grade == st2.course)) {
            System.out.println("Cтуденты одинаковы");
        } else {
            System.out.println("Студенты разные");
        }
    }

    public static void sravnenieVsego(Student st1, Student st2) {

        if (st1.name.equals(st2.name))  {
          if (st1.course == st2.course) {
            if (st1.grade == st2.grade) {
                System.out.println("Имена курс и оценки у студентов одинаков");}
                else{
                    System.out.println("Имена и курс у студентов одинаковы, а оценки разные");
                }
            } else {
                System.out.println("Имена одинаковы, но курсы разные");
            }}
          else {
            System.out.println("У студентов разные имена ");
        }
    }

    public static void main(String[] args) {
        Student st1=new Student("Antoha",3,4.0);
        Student st2=new Student("Antoha",3,5.2);
        sravnenieStudentov(st1,st2);
        sravnenieVsego(st1,st2);

    }
}
