package udemy.lesson6OverloadingAndMethods;

public class Home6work1 {
    int show () {
        int result5 = 0;
        System.out.println("Summa vseh chisel " + result5);
        return result5;
    }

    int show (int a){
        int result6 = a;
        System.out.println("Summa vseh chisel " + result6);
        return result6;
    }
    int show (int a, int b){
        int result =a+b;
        System.out.println("Summa vseh chisel " + result);
        return result;
    }
    int show (int a,int b,int c){
        int result1=a+b+c;
        System.out.println("Summa vseh chisel " + result1);
        return result1;

    }
    int show (int a,int b,int c, int d){
        int result2=a+b+c+d;
        System.out.println("Summa vseh chisel " + result2);
        return result2;
    }
}
class Proverka {
    public static void main(String[] args) {
        Home6work1 h1=new Home6work1();
        h1.show();
        h1.show(3);
        h1.show(3,5);
        h1.show(1,3,4);
        h1.show(2,3,4,6);

    }
}
