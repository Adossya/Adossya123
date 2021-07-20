package udemy.lesson29;

public class test1 {
    public static void main(String[] args) {
        //Driver [] array1={new Driver(),new Driver()};
        //Employee [] array2={new Teacher(),new Driver(), new Doctor()};
        //Help_able [] array3={new Teacher(),new Driver(), new Doctor()};


        Employee emp1=new Teacher();
        Employee emp2=new Driver();
        Employee emp3=new Doctor();
        Employee[] array1={emp1,emp2,emp3};
        System.out.println(emp1 instanceof Teacher);


//        for (Employee emp:array1){
//            emp.work();
//        }

//        Help_able h=new Teacher();
//        h.help();
//        emp1.help();
//        emp1.work();
//        emp2.work();
//        emp3.work();
    }
}
abstract class Employee implements Help_able {
    void sleep (){  System.out.println("Employee sleeps");    }
    abstract void work();
}
class Teacher extends Employee implements Help_able{
    public void help(){
        System.out.println("Teacher Helps");
    }
    void work(){
        System.out.println("Teacher Works");
    }
}
class Driver extends Employee {
    public void help(){
        System.out.println("Driver Helps");
    }
    void work(){
        System.out.println("Driver Works");
    }
}
class Doctor extends Employee {
    public void help(){
        System.out.println("Doctor Helps");
    }
    void work(){
        System.out.println("Doctor Works");
    }
}
interface Help_able{
    void help();
}