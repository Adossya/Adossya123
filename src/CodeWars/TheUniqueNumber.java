package CodeWars;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;


public class TheUniqueNumber {
    public static double findUniq(double[] arr) {
        ArrayList<Double> list = new ArrayList<>();
        for (double a : arr) {
            list.add(a);
        }
        Collections.sort(list);

        Set<Double> set = new LinkedHashSet<>(list);
        ArrayList<Double> list1 = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list.get(i).equals(list1.get(j))) {
                    list.remove(i);
                }
            }
        }
        if (list1.get(0).equals(list.get(0))) {
            return list1.get(1);
        } else if (list1.get(1).equals(list.get(0))) {
            return list1.get(0);
        } else {
            return list1.get(0);
        }

    }


    public static void main(String[] args) {
        double[] array = new double[]{3.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0};

        System.out.println(findUniq(array));
    }
}
