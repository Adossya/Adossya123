package udemy.lesson29;

public class test4 {
    public static void main(String[] args) {
        Employee2 emp1=new Doctor1();
        Employee2 emp2=new Teacher1();
        Employee2 emp3=new Driver1();
        Employee2 emp4=new Employee2();
        Employee2 [] array={emp1,emp2,emp3,emp4};
        for (Employee2 e:array){
            if(e instanceof Driver1){
                System.out.println(((Driver1)e).nazvanieMashin);
                ((Driver1)e).vodit();
            }
        }

    }


}
class Employee2 extends java.lang.Object{
    double salary =100;
    String name="Kolya";
    int age;
    int expirience;
    void eat(){
        System.out.println("Kushat");
    }
    void sleep(){
        System.out.println("Spat");
    }
}
class Doctor1 extends Employee2 implements Help_able1 {
    public void help(){
        System.out.println("Doctor okazivaet pomosh");
    }
    String specializaciya="Hirurg";
    void lechit (){
        System.out.println("Lechit");
    }
}
class Teacher1 extends Employee2 {
    String specializaciya1="Istorik";
    int kolichestvoUchenikov;
    void uchit(){
        System.out.println("Uchit");
    }
}
class Driver1 extends Employee2 {
    String nazvanieMashin;
    void vodit(){
        System.out.println("Vodit");
    }
}
interface Help_able1{
    void help();
}