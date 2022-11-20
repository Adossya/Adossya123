package udemyBlackBeltJava.Regex;

public class PrintfExample {

    static void EmployeeInfo (Employee emp){
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n", emp.id,emp.name, emp.suname, emp.salary*(1+ emp.bonusPct));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Zaur", "Tregulov",500,0.2);
        Employee emp2 = new Employee(20,"Anton", "Lupalov",2500,0.5);
        Employee emp3 = new Employee(1111,"Roman", "Remez",300,0.25);
        EmployeeInfo(emp1);
        EmployeeInfo(emp2);
        EmployeeInfo(emp3);

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f \n",20,"Anton", "Lupalov",2500*(1+0.15));
        System.out.println(newString);

    //    System.out.printf("string -nujno viravnit po levomu krayu" + " a vtoroy parametr - double, nado okruglit do desyatix","privet","3.1415");
    }
}

class Employee {
    int id;
    String name;
    String suname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String suname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.suname = suname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}