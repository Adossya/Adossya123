package udemyBlackBeltJava.ComporableComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee25> list25= new ArrayList<>();
        Employee25 emp1=new Employee25(100,"Zaur","Tsigankov",1345);
        Employee25 emp2=new Employee25(15,"Ivan","Lupov",130);
        Employee25 emp3=new Employee25(123,"Ivan","Sidorov",1500);
        list25.add(emp1);
        list25.add(emp2);
        list25.add(emp3);
        System.out.println(list25);
        Collections.sort(list25, new IdComparator());
        System.out.println(list25);

    }
}
class Employee25 {
    int id;
    String name;
    String suname;
    int salary;

    public Employee25(int id, String name, String suname, int salary) {
        this.id = id;
        this.name = name;
        this.suname = suname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", suname='" + suname + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee25 anotherEmp) {
//        if (this.id==anotherEmp.id){
//            return 0;
//        }
//        else  if(this.id<anotherEmp.id){
//            return -1;
//        }
//        else  {
//        return 1;
//    }
}
class IdComparator implements Comparator <Employee25>{

    @Override
    public int compare(Employee25 emp1, Employee25 emp2) {
        if (emp1.id == emp2.id){
        return 0;}
        else if (emp1.id<emp2.id){
            return  -1;
        }
        else {return 1;}
    }
    class IdComparator implements Comparator <Employee25>{

        @Override
        public int compare(Employee25 emp1, Employee25 emp2) {
            if (emp1.id == emp2.id){
                return 0;}
            else if (emp1.id<emp2.id){
                return  -1;
            }
            else {return 1;}
        }
    }
}

