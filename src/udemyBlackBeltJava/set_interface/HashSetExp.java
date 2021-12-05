package udemyBlackBeltJava.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExp {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Anton");
        set.add("Marina");
        set.add("Igor");
        set.add("Zaur");
    //    set.add(null);
        set.remove("Marina");
        System.out.println(set.size());
        System.out.println(set.contains("Zaur"));
        System.out.println(set);
        for (String s:set){
            System.out.print(s+" ");
        }


    }
}
