package udemyBlackBeltJava.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector <String>vector=new Vector<>();
        vector.add("Zaur");
        vector.add("Anton");
        vector.add("Ira");
        vector.add("Vitalya");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(2));
    }
}
