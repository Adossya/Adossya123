package CodeWars;

import java.util.*;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String s3=s1.concat(s2);
        char [] array=s3.toCharArray();
        Set <Character> set1=new HashSet<>();
        for (int i=0; i<array.length; i++){
            set1.add(array[i]);
        }
        String s4="";
        return s4=set1.toString();
    }

    public static void main(String[] args) {
       String a = "xyaabbbccccdefww";
       String b = "xxxxyyyyabklmopq";

        System.out.println(longest(a,b));
    }
}
