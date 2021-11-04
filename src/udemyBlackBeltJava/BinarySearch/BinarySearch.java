package udemyBlackBeltJava.BinarySearch;

import udemy.p1.p2.p3.p4.p5.E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        ArrayList <Integer> arrayList=new ArrayList<>();
//        arrayList.add(-3);
//        arrayList.add(8);
//        arrayList.add(12);
//        arrayList.add(-8);
//        arrayList.add(0);
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(150);
//        arrayList.add(-30);
//        arrayList.add(19);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
//        int index1= Collections.binarySearch(arrayList,12);
//        System.out.println(index1);

        Employee emp1=new Employee(100,"zaur",1234);
        Employee emp2=new Employee(1,"dima",124);
        Employee emp3=new Employee(235,"vova",1000);
        Employee emp4=new Employee(73,"kolya",5000);
        Employee emp5=new Employee(12,"misha",6440);
        Employee emp6=new Employee(87,"grisha",5970);
        Employee emp7=new Employee(91,"vasya",3050);
        List <Employee> employeeList=new ArrayList<>() ;
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);

    }
}

class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
