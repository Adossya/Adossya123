package udemy.lesson5Constructor;

public class Employee {
    Employee (int nomer, String familiya, int vozrast, double zp, String dolgnost) {
        id = nomer;
        surname = familiya;
        age = vozrast;
        salary = zp;
        department = dolgnost;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
    public double uvelish (){
        salary*=2;
        return salary ;
    }

}
class  EmployeeTes{
    public static void main(String[] args) {
        Employee object1=new Employee(1,"Lupalov",28,2000.50,"VTS");
        Employee object2=new Employee(2,"Abramovskiy",29,11000.10,"Bankir");
        object1.uvelish();
        System.out.println(object1.salary);
        System.out.println(object1.department);
        object2.uvelish();
        System.out.println(object2.salary);
        System.out.println(object2.department);

    }
}