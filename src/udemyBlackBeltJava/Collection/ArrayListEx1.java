package udemyBlackBeltJava.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2=new ArrayList<>(30);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");
        List<String> arrayList3=new ArrayList<>(30);
        List<String> arrayList4=new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        System.out.println(arrayList1==arrayList4);


        ArrayList arrayList5=new ArrayList();
        arrayList5.add(5);
        arrayList5.add("String");
        arrayList5.add(new Car());
        System.out.println(arrayList5);
    }
}

class Car {}
