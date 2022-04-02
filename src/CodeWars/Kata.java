package CodeWars;

import java.util.Scanner;

public class Kata {
    public static int multiply (int i1, int i2){
        return i1*i2;
    }
//    public  static  int Multiply3 (int i1, int i2, int i3){
//        Calculator c;
//        int a=0;
//        c=(a1,a2,a3)->{return a1+a2+a3;};
//        a=c;
//        return a;
//    }
    public static void main(String[] args){
        Kata K=new Kata();
        Scanner scan=new Scanner(System.in);
        int i1=scan.nextInt();
        int i2=scan.nextInt();
//      int i3=scan.nextInt();

     System.out.println(K.multiply(i1,i2));
//        System.out.println(Multiply3(i1,i2,i3));
    }
}

interface Calculator1 {
    int Calculator (int a,int b, int c);
}

