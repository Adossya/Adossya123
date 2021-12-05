package udemyBlackBeltJava.set_interface;

import java.util.HashSet;

public class HashSetExm2 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(5);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(8);
        HashSet<Integer> hs2=new HashSet<>();
        hs2.add(7);
        hs2.add(4);
        hs2.add(5);
        hs2.add(3);
        hs2.add(8);
        HashSet<Integer> union=new HashSet<>(hs); //union-объединение
        union.addAll(hs2);
        System.out.println(union);
        HashSet<Integer> intersect=new HashSet<>(hs); //intersect-пересечение
        intersect.retainAll(hs2);
        System.out.println(intersect);
        HashSet<Integer> subtract=new HashSet<>(hs); //subtract-разность
        subtract.removeAll(hs2);
        System.out.println(subtract);
    }
}
