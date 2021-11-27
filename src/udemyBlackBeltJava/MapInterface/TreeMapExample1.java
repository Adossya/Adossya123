package udemyBlackBeltJava.MapInterface;

import java.util.TreeMap;


    public class TreeMapExample1 {
        public static void main(String[] args) {


        TreeMap<Double,Student> mapppp=new TreeMap<>();
        Student st1=new Student ("Zaurr","Treggg",3);
        Student st2=new Student("Yana","Zubrova",1);
        Student st3=new Student("Nikita","Boyko",4);
        Student st4=new Student("Daun","Zelov",3);
        Student st5=new Student("Anna","Moyka",5);
        Student st6=new Student("Vanga","Kaylo",5);
        Student st7=new Student("Vlad","Gah",1);

        Student st8=new Student("Vlad","Gah",1);
        mapppp.put(5.8,st1);
        mapppp.put(0.2,st2);
        mapppp.put(1.2,st3);
        mapppp.put(3.2,st4);
        mapppp.put(5.4,st5);
        mapppp.put(7.2,st6);
        mapppp.put(4.2,st7);
        mapppp.put(4.92,st8);
            System.out.println(mapppp);
            System.out.println(mapppp.remove(0.2));
            System.out.println(mapppp);


    }

}
