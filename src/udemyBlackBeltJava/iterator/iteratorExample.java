package udemyBlackBeltJava.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");

        Iterator <String> iterator1=arrayList1.iterator();
        while (iterator1.hasNext()){
            iterator1.next();

//dasda
            //dsadsadadasd
            iterator1.remove();
        }
    }
}
