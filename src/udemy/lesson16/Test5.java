package udemy.lesson16;

import java.util.Locale;

public class Test5 {
    public static void main(String[] args) {
        String s1=new String("LuPalov");
        String s2=s1.toLowerCase();
        String s3=s1.toUpperCase();
        System.out.println(s2);
        System.out.println(s3);

        boolean b= s1.contains("Pa");
        System.out.println(b);// при method chaining методы выполняются последовательно слева направо.
    }
}
