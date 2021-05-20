package udemy.lesson6;

public class Employee {
    Employee(int id2, String surname2, int age2){
        id=id2;
        surname=surname2;
        age=age2;
    }

    Employee(String surname3, int age3){
        surname=surname3;
        age=age3;
    }
    Employee(int id4, String surname4, int age4, double salary4, String department4){
        id=id4;
        surname=surname4;
        age=age4;
        salary=salary4;
        department=department4;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
}
class  EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Ivanov",27);
        Employee e2=new Employee("Lupalov",28);
        Employee e3=new Employee(3,"Abramovskiy",28,3999.0,"Bank");
        System.out.println(e3.salary);
    }
}