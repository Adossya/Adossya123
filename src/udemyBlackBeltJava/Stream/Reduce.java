package udemyBlackBeltJava.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        int result=list.stream().reduce((accumulator, element)->accumulator*element).get(); //accumulator

        int result2=list.stream().reduce(2,(accumulator, element)->accumulator*element); //accumulator
        System.out.println(result2);

        List <String> list3=new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela");
        list3.add("ok");
        list3.add("poka");
        String result3=list3.stream().reduce((accumulator,e)->accumulator+""+e).get();
        System.out.println(result3);

//        List<Integer> list100=new ArrayList<>();
//        Optional<Integer> o =list.stream().reduce((accumulator, element)->accumulator*element);
//        if (o.isPresent()){
//            System.out.println(o.get());
//        } else {
//            System.out.println("Not Present");
//        }

//        System.out.println(result);
}}
