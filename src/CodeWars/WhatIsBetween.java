package CodeWars;

public class WhatIsBetween {

    public static int[] between(int a, int b) {
        int [] array=new int[b-a+1];
        int c=a;
        for (int i=0;i<=b-a;i++,c++){
            array[i]=c;
        }
        for (int q:array){
            System.out.print(q+" ");
        }
        return array;
        }


    public static void main(String[] args) {
        int a=-2;
        int b=2;

        between(a,b);

    }
}
