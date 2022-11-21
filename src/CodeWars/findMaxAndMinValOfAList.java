package CodeWars;

import java.util.Arrays;

public class findMaxAndMinValOfAList {
    public static int min(int[] list) {

        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(min(new int[] {-52, 56, 30, 29, -54, 0, -110}));
        System.out.println(max(new int[] {42, 54, 65, 87, 0}));
    }
}
