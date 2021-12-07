package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listttt {
    public static int sortMethod (int n,List<Integer> ar){
        int pari=0;
        Collections.sort(ar);
        Integer [] array=new Integer[n];
        for (int i=0;i<array.length;i++){
            array[i]=ar.get(i);
        }
        Outer:
        for (int i=0; i<array.length;i++){
            Inner:
            for (int j=i+1; j<array.length;j++){
                if (array[i]==array[j]){i=j; pari+=1; continue Outer;}
            }
        }
        return pari;

    }


    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(20);
        list1.add(10);
        list1.add(10);
        list1.add(30);
        list1.add(50);
        list1.add(10);
        list1.add(20);
        System.out.println(list1);
        System.out.println(sortMethod(9,list1));
    }
}
