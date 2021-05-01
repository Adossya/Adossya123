package udemy.lesson4;


public class Student {
    String name;
    String suname;
    int math;
    int economy;
    int english;
    double srednya;
    public double sred (Student stud){
        srednya=(stud.english+stud.economy+stud.math)/3;
        return srednya;
    }



    }

class StudentTest {
    public static void main(String[] args) {
        Student object1 = new Student();
        object1.name = "Anton";
        object1.suname = "Lupalov";
        object1.math = 5;
        object1.economy = 1;
        object1.english = 3;
        object1.sred(object1);
        double a= object1.sred(object1);
        System.out.println(a);

    }
}

