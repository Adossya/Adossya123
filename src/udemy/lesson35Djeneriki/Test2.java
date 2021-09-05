package udemy.lesson35Djeneriki;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();

        al.add(10);
        al.add(12);
        al.add(103);
        int a=GenMethod.getSecondElement(al);
        System.out.println(a);

        ArrayList<String>al1=new ArrayList<>();
        al1.add("10");
        al1.add("sd");
        al1.add("dsds");
        String b=GenMethod.getSecondElement(al1);
        System.out.println(b);

    }
//    public void abc(Info<String> info){
//        String s=info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        Integer s=info.getValue();
//    }
}

class GenMethod{
    public static <T> T getSecondElement (ArrayList<T> al){
        return al.get(1);
    }
}

class Parent {
    public void abc(Info<String> info){
        String s=info.getValue();
    }}

class Chiled extends  Parent {
//    public void abc(Info<Integer> info){
//        Integer s=info.getValue();
//    }
}
