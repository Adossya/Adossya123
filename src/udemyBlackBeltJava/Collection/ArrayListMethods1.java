package udemyBlackBeltJava.Collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList <String>arrayList1=new ArrayList<>();
        arrayList1.add("String");
        arrayList1.add("Strin23213g");

        arrayList1.add("Strin3213123g");
        arrayList1.add(0,"0000");

        arrayList1.set(1,"Set");

        for (String s:arrayList1){
            System.out.print(s + " ");
        }

        System.out.println(arrayList1.get(0));
        arrayList1.remove(0);
        System.out.println(arrayList1);

    }

}
