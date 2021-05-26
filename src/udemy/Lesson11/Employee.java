package udemy.Lesson11;

import udemy.p1.p2.p3.p4.p5.E;

public class Employee {
    public  String name;
    public double salary;

    Employee (String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public double uvelishit (double a){
        a=a*2;
        return a;
    }
    public double uvelishit2 (){
        salary=salary*2;
        return salary;
}
    }
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1=new Employee("Tanya",100.35);
        double d=emp1.uvelishit(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.uvelishit2();
        System.out.println(emp1.salary);
    }
}