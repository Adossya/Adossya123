package udemyBlackBeltJava.Arraylistsss;


import java.util.ArrayList;
import java.util.List;

public class Arraylistmethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
//        System.out.println("Arraylist: "+arrayList1);
//        Object [] array=arrayList1.toArray();
//        String [] array5=arrayList1.toArray(new String[0]);
//        for (String s:array5) {
//            System.out.println(s + " ");
//        }
//
        List<Integer> list1=List.of(3,8,13);
        System.out.println(list1);

        List<String> list2=List.copyOf(arrayList1);
        System.out.println(list2);
//        list1.add(100);

    }
}

