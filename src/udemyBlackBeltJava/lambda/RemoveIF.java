package udemyBlackBeltJava.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIF {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Privet");
        a1.add("Poka");
        a1.add("Ok");
        a1.add("Uchim Java");
        a1.add("A imenno lambdas");
//        Predicate<String> p= (String a) -> {
//            return a.length() <= 5;
//        };
//        a1.removeIf(p);
        a1.removeIf((String a) -> {
            return a.length() <= 5;
        });


        System.out.println(a1);
    }
}
