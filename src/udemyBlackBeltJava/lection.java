package udemyBlackBeltJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lection {
    public static void main(String[] args) {
        List <String> list=new ArrayList<>();
        list.add("Zaur");
        list.add("Toha");
        list.add("Antoha");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
