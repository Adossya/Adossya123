package udemy.lesson16;

public class Test4 {
    public static void main(String[] args) {

}

}
class  Employee{
    double salary;
    boolean isManager;
    Employee (double salary, boolean isManager){
        this.salary=salary;
        this.isManager=isManager;
    }
}
class  TestEmployee{
    public static void main(String[] args) {
        Employee emp=new Employee(100.5,true);
        System.out.println(emp.isManager+""+emp.salary);
    }
}