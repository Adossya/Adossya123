package udemy.lesson33LyamdaVirageniya;
import java.util.ArrayList;
import java.util.function.*;

public class EmployeeLyamdi {
    String name;
    String department;
    double salary;
    EmployeeLyamdi (String name, String department, double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
}

class TestEmployee {
    void printEmployee (EmployeeLyamdi el){
        System.out.println("Name of Employee: "+el.name+", Department of Employee: "+el.department+", Employee salarey: "+el.salary);
        System.out.println("");
    }
    void filtraciyaRabotnikov (ArrayList<EmployeeLyamdi> list, Predicate <EmployeeLyamdi> t){
        for (EmployeeLyamdi el1: list){
        if (t.test(el1))
           printEmployee(el1);}
    }

    public static void main(String[] args) {

        ArrayList <EmployeeLyamdi> list1=new ArrayList<EmployeeLyamdi>();
        EmployeeLyamdi El1=new EmployeeLyamdi("Dima","IT",2000.0);
        EmployeeLyamdi El2=new EmployeeLyamdi("Anton","BOMG",100.0);
        EmployeeLyamdi El3=new EmployeeLyamdi("KOLYA","Rinok",500.0);
        EmployeeLyamdi El4=new EmployeeLyamdi("Liza","Trava",1000.0);
        EmployeeLyamdi El5=new EmployeeLyamdi("Bariga","Bariga",5000.0);
        list1.add(El1);
        list1.add(El2);
        list1.add(El3);
        list1.add(El4);
        list1.add(El5);

        TestEmployee te=new TestEmployee();
        te.filtraciyaRabotnikov(list1,(x)->{return x.salary>200;});
        System.out.println("_______________");
        te.filtraciyaRabotnikov(list1,(x)->{return x.name.startsWith("A") && x.salary!=450;});
        System.out.println("_______________");
        te.filtraciyaRabotnikov(list1,(x)->{return x.name==x.department;});
        System.out.println("_______________");



    }
}

