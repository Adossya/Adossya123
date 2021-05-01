package udemy.lesson5;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;
    Employee (int nomer, String familiya, int vozrast, double zp, String dolgnost) {
        id = nomer;
        surname = familiya;
        age = vozrast;
        salary = zp;
        department = dolgnost;
    }
    public double uvelish (){
        salary*=2;
        return salary ;
    }

}
class  EmployeeTes{
    public static void main(String[] args) {
        Employee object1=new Employee(1,"Lupalov",28,2000.50,"VTS");

        object1.uvelish();
        System.out.println(object1.salary);

    }
}