package udemyBlackBeltJava.generics;

import udemy.lesson8.Car;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List list=new ArrayList();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("sdsdad"));
//        list.add(new Car());
        list. add("privet");
        list. add("poka");
        list. add("ok");
        list. add("dasdasa");
        for (Object o:list){
            System.out.println(o+" dlina "+((String)o).length());
        }


    }
}
