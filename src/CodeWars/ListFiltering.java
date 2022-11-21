package CodeWars;


import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        Object integerss = 0;
        List <Object> list1 = new ArrayList<>();
        list1 = list.stream().filter(element -> { return element.getClass().equals(integerss.getClass());}).collect(Collectors.toList());
            return list1;
        }





    public static void main(String[] args) {
        List<Object>list =List.of(1, 2, "a", "b",1);
        System.out.println(filterList(list));

    }
}
