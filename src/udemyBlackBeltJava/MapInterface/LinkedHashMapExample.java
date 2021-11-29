package udemyBlackBeltJava.MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap <Double,Student> lhm=new LinkedHashMap<>(16,0.75f,true);

        Student st1=new Student ("Zaurr","Treggg",3);
        Student st2=new Student("Yana","Zubrova",1);
        Student st3=new Student("Nikita","Boyko",4);
        Student st4=new Student("Daun","Zelov",3);

        lhm.put(5.8,st1);
        lhm.put(0.2,st2);
        lhm.put(1.2,st3);
        lhm.put(3.2,st4);
        System.out.println(lhm);

        System.out.println(lhm.get(0.2));
        System.out.println(lhm.get(1.2));
        System.out.println(lhm);

    }
}
