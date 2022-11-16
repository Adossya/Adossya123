package CodeWars;

import java.util.ArrayList;

public class CountTheDivisibleNumber {
    public static long divisibleCount(long x, long y, long k) {
        long dlinna = y-x;
        long c1 = 0;

        if (y==x && y%k !=0 ){c1+=1;}
        if (x%k==0) {
            System.out.println("if");
            return c1=dlinna/k+c1;

        } else {
            System.out.println("else");
            return c1=dlinna/k;
        }



    }

    public static void main(String[] args) {

        long x = 11;
        long y = 345;
        long k = 17;
        System.out.println(divisibleCount(x,y,k));
    }
}
