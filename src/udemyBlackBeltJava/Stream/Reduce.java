package udemyBlackBeltJava.Stream;

import java.util.ArrayList;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result=list.stream().reduce((accumulator, element)->accumulator*element).get();
    }
}
