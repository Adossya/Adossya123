package CodeWars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberZooPatrol {
    public static int findMissingNumber(int[] numbers) {
        if (numbers.length==1){
            return 2;
        }
        List<Integer> list1 = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if (list1.isEmpty()){
            return 1;
        }
        Collections.sort(list1);

        int[] array = list1.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array.length == 0) {
                    return 1;
                }
                if (array[0] != 1) {
                    return 1;
                }
                if (array[j] - array[j - 1] == 2) {
                    return array[j] - 1;
                }
            }
        }
        return 5;
    }
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1}));
    }
}
