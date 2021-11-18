package udemyBlackBeltJava.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExm1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(1882,"Anton Lupalov");
        map1.put(322,"Olga Kovaleva");
        map1.put(100,"Karina Lupalova");
        map1.putIfAbsent(322,"Karina Lupalova");
        map1.put(null,"Andrey Kriganovskiy");
        map1.put(533232,null);
        System.out.println(map1);
        System.out.println(map1.get(100));
        System.out.println(map1.remove(null));
        System.out.println(map1);

        System.out.println(map1.containsValue("Anton Lupalov"));
        System.out.println(map1.containsKey(100));

        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String,String> map2 = new HashMap<>();
        map2.put("Sasha","Dobriy");
        System.out.println(map2);

    }
}
