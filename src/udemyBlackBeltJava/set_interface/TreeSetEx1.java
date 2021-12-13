package udemyBlackBeltJava.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> treeSett=new TreeSet<>();
        treeSett.add(5);
        treeSett.add(8);
        treeSett.add(1);
        treeSett.add(10);
        // treeSett.add(null); null- хранить не может, так как и в treemap
        treeSett.remove(2);
        System.out.println(treeSett.contains(1));
        System.out.println(treeSett);
    }
}
