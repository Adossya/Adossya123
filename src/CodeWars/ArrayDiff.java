package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(b).boxed().collect(Collectors.toList());
        list1.removeAll(list2);
        int [] c=list1.stream().mapToInt(Integer::intValue).toArray();
        return c ;
    }

    public static void main(String[] args) {
    int [] a= {1,2};
    int [] b= {1};
    for (int abc:arrayDiff(a,b)){
        System.out.print(abc+" ");
    }

    }
}
