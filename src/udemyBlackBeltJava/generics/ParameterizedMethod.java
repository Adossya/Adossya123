package udemyBlackBeltJava.generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(10);
        al1.add(120);
        al1.add(50);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
        ArrayList<String> al2=new ArrayList<>();
        al2.add("sdasd");
        al2.add("edsada");
        al2.add("321312");
        String b = GenMethod.getSecondElement(al2);
        System.out.println(b);
    }
}

class GenMethod{
    public static <T> T getSecondElement (ArrayList <T> a1){
        return a1.get(1);
    }
}
