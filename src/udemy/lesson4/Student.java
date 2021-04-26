package udemy.lesson4;

public class Student {
    int Ticket_number;
    String name;
    String suname;
    int year_study;
    int math;
    int economy;
    int english;
}
class StudentTest {
    public static void main(String[] args) {
        Student object1 = new Student();
        Student object2 = new Student();
        Student object3 = new Student();

        object1.Ticket_number=1;
        object1.name="Anton";
        object1.suname="Lupalov";
        object1.year_study=2009;
        object1.math=5;
        object1.economy=1;
        object1.english=3;

        object2.Ticket_number=2;
        object2.name="Dmitriy";
        object2.suname="Abramovskiy";
        object2.year_study=2010;
        object2.math=3;
        object2.economy=5;
        object2.english=4;

        object3.Ticket_number=3;
        object3.name="Ivan";
        object3.suname="Roben";
        object3.year_study=2021;
        object3.math=2;
        object3.economy=4;
        object3.english=1;


        System.out.print("Student "+object1.name);
        System.out.print(" "+object1.suname);
        System.out.println(" Srednya9 ocenka "+(object1.math+object1.economy+object1.english)/3);

        System.out.print("Student "+object2.name);
        System.out.print(" "+object2.suname);
        System.out.println(" Srednya9 ocenka "+(object2.math+object2.economy+object2.english)/3);

        System.out.print("Student "+object3.name);
        System.out.print(" "+object3.suname);
        System.out.println(" Srednya9 ocenka "+(object3.math+object3.economy+object3.english)/3);

    }
}
