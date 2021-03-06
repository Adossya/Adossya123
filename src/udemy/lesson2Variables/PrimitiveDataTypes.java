package udemy.lesson2Variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 127;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 10000000000L;
        long l3 = 9_223_372_036_854_775_807L;
        System.out.println(l3);

        float f1 = 3.14f;
        float f3 = 20.0f;

        double d1 = 5.5;
        double d2 = 87.65;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 500; // 10 система исчесления

        char c6 = '\u05AB'; // 16 система исчесления

        boolean booll1 = true;
        boolean booll2 = false;

        int a1 = 60;

        int a2 = 0b111100; // 2 система исчесления

        int a3 = 0B111100; // 2 система исчесления

        int a4 = 0_74;// 8 система исчесления

        int a5 = 0x3C;// 16 система исчесления
        int a6 = 0X3C;


        int a7 = 1_000_000_000;

        System.out.println(a7);


    }
}
