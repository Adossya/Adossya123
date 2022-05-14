package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class IntegerDeath {
    public static int computeDepth(int n) {
        Character[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Set<Character> digitals1 = new TreeSet<Character>(Arrays.asList(digits));
        int summa = 0;
        int count=0;
        for (int i = 1; ; i++) {
            count+=1;
            summa = i * n;
            System.out.println(summa);
            char [] a=Integer.toString(summa).toCharArray();

            for (int j = 0; j < a.length; j++) {
                digitals1.remove(a[j]);
            }
            if (digitals1.isEmpty()){break;}
        }
        for (Character bo:digitals1){
            System.out.print(bo+" ddsadsa");
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 42;
        System.out.println(computeDepth(a));
    }
}
