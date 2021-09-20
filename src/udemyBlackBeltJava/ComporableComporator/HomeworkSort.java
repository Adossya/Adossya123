package udemyBlackBeltJava.ComporableComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class HomeworkSort implements Comparable<HomeworkSort>{
    int id;
    double salary;
    String name;

    public HomeworkSort(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HomeworkSort{" + "id=" + id + ", salary=" + salary + ", name='" + name + '\'' +'}';
    }


    @Override
    public int compareTo(HomeworkSort o) {
        return this.id-o.id;
    }
}
class Test {
    public static void main(String[] args) {
        HomeworkSort hs1=new HomeworkSort(1,200,"Leha");
        HomeworkSort hs2=new HomeworkSort(6,22323,"Andrey");
        HomeworkSort hs3=new HomeworkSort(2,243,"Evgeniy");
        HomeworkSort hs4=new HomeworkSort(15,12300,"Anatoliy");
        List<HomeworkSort> list1=new ArrayList<>();
        list1.add(hs1);
        list1.add(hs2);
        list1.add(hs3);
        list1.add(hs4);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1,new EsheCompare());
        System.out.println(list1);
        Collections.sort(list1,new Comp());
        System.out.println(list1);
    }
}

class Comp implements Comparator <HomeworkSort>{

    @Override
    public int compare(HomeworkSort o1, HomeworkSort o2) {
        return (int)(o1.salary-o2.salary);
    }

}
class EsheCompare implements Comparator<HomeworkSort>{
    @Override
    public int compare(HomeworkSort o1, HomeworkSort o2) {
        return o1.name.compareTo(o2.name);
    }
}

