package udemyBlackBeltJava.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcardd {
    public static void main(String[] args) {
        List <?> list=new ArrayList<String>();
       // list.add("hello"); - нельзя использовать методы которые меняют наш объект
        List <? extends Number> list30=new ArrayList<Integer>();

        List<Double>list1=new ArrayList<>();
        list1.add(3.14);
        list1.add(3.14);
        list1.add(3.14);
        showListInfo(list1);
        List<String>list2=new ArrayList<>();
        list2.add("pds");
        list2.add("dsada");
        list2.add("sda");
        showListInfo(list2);

        ArrayList<Double>al=new ArrayList<>();
        al.add(3.14);
        al.add(3.15);
        al.add(3.16);
        System.out.println(summ(al));

        ArrayList<Integer>al1=new ArrayList<>();
        al1.add(3);
        al1.add(323);
        al1.add(6);
        System.out.println(summ(al1));
    }
    static void showListInfo (List<?> list ){
        System.out.println("My list have:"+list);
    }

    public static double summ (ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}