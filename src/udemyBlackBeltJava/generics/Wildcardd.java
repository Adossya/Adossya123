package udemyBlackBeltJava.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcardd {
    public static void main(String[] args) {
        List  <?>list=new ArrayList<Integer>();
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
    }
    static void showListInfo (List<?> list ){
        System.out.println("My list have:"+list);
    }
}
