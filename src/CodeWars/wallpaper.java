package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class wallpaper {
        public static String wallpaper1 (double l, double w, double h, List<String> list){
            double S=2*(l*h)+2*(w*h);
            double rolls=Math.round(S/5.2*1.15);
            System.out.println(rolls);

            return list.get((int)rolls);
        }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"));
        System.out.println(list);
        System.out.println(wallpaper1(6.3,5.8,3.13,list));

    }
}
