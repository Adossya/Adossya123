package udemyBlackBeltJava.MapInterface;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable <Double,Student> ht=new Hashtable<>();

        Student st1=new Student ("Zaurr","Treggg",3);
        Student st2=new Student("Yana","Zubrova",1);
        Student st3=new Student("Nikita","Boyko",4);
        Student st4=new Student("Daun","Zelov",3);

        ht.put(7.8,st1);
        ht.put(9.3,st2);
        ht.put(5.8,st3);
        ht.put(1.3,st4);

        System.out.println(ht );
    }
}
