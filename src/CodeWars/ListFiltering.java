package CodeWars;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        List <Object> list1=List.of(1,3);
//           list1 = list.stream().filter(element -> {return element==null;}).collect(Collectors.toList());


            return list1;
        }





    public static void main(String[] args) {
        List<Object>list =List.of(1, 2, "a", "b",1);
        System.out.println(filterList(list));

    }
}
