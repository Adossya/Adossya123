package udemyBlackBeltJava.Stream;

import java.util.stream.Stream;

public class Concat {

    public static void main(String[] args) {
        Stream <Integer> stream1=Stream.of(1,2,3,4,5,1,2,3);
        Stream <Integer> stream2=Stream.of(1,2,3,4,5);
        Stream <Integer> stream3=Stream.of(6,7,8,9,10);
        Stream <Integer> stream4=Stream.concat(stream2,stream3);
  //      stream4.forEach(System.out::print);

    //    stream1.distinct().forEach(System.out::println);

      //  System.out.println(stream4.distinct().count());
        System.out.println(stream1.distinct().peek(System.out::println).count());

    }
}
