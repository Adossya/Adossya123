package udemy.lesson5Constructor;


public class StudentTestHomework5 {
    int Ticket_number;
    String name;
    String suname;
    int math;
    int economy;
    int english;
}

class StudentTest {
    public static void main(String[] args) {
        StudentTestHomework5 object1 = new StudentTestHomework5();

        object1.Ticket_number = 1;
        object1.name = "Anton";
        object1.suname = "Lupalov";
        object1.math = 5;
        object1.economy = 1;
        object1.english = 3;
        System.out.println(object1.name+" "+object1.suname);
    }
}