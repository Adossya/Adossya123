package CodeWars;

import java.util.Arrays;
import java.util.Collection;

public class InvertValues {
    public static int[] invert(int[] array) {
        int [] inver = Arrays.stream(array)
                .map(element->-1*element).toArray();

        return inver;
    }

    public static void main(String[] args) {
        System.out.println(invert(new int[] {-1,-2,-3,-4,-5}));
    }

}
