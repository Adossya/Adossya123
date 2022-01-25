package udemyBlackBeltJava.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachhh {
    public static void main(String[] args) {
        List <String> list = List.of("privet","kak dela","normal'no","pola");
        for (String s:list){
            System.out.print (s+" ");
        }
        list.forEach(str-> System.out.println(str));
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(i->{
                System.out.print(i+" ");
                i*=2;
                System.out.println(i+" ");
        ;});
    }
}
