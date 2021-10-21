package CodeWars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberZooPatrol {
    public static int findMissingNumber(int[] numbers) {
        if (numbers.length==1 ){
            return 2;
        }

        List<Integer> list1 = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if (list1.isEmpty()){
            return 1;
        }
        Collections.sort(list1);

        int[] array = list1.stream().mapToInt(Integer::intValue).toArray();
/*        int summ=0;
        int last=0;
        for (int i=0;i<array.length;i++){
            summ+=array[i];
            last=array[array.length-1]*(array[array.length-1]+1)/2;
        }
            return last-summ;
    }*/
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[0] != 1) {
                    return 1;
                }
                if (array[j] - array[j - 1] == 2) {
                    return array[j] - 1;
                }
            }
        }
    return 5;}


    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8}));
    }
}
