package udemy.lesson31ErrorsPart1;

public class Test1 {
    public static void main(String[] args) {
    Animal an=new Tiger10();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}


class Animal{
    int a=5;
    static int b=10;
    void abc (){
        System.out.println("non-static method form class Animal");
        }
    static void def (){
        System.out.println("static method from class Animal");
        }
}

class Tiger10 extends Animal {
    int a=15;
    static int b=20;
    void abc (){
        System.out.println("non-static method form class Tige");
    }
    static void def (){
        System.out.println("static method from class Tiger");
    }
}


