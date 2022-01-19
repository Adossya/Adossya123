package CodeWars;

import udemy.p1.p2.p3.p4.D;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;


public class TheUniqueNumber {
    public static double findUniq(double arr[]) {
        List<Double> list = DoubleStream.of(arr).boxed().collect(Collectors.toList());
        Collections.sort(list);
        Set<Double> set=new HashSet<>(list);
        ArrayList<Double> list1=new ArrayList<>(set);

        if (list1.get(0).equals(list.get(0)) && list1.get(0).equals(list.get(1)) ){
            return list1.get(1);
        } else if(list1.get(0).compareTo(list.get(0))==0 && list1.get(0).compareTo(list.get(1))!=0 && list1.get(0).compareTo(list.get(2))!=0){
            return list1.get(0);
        }  else if (list1.get(0).compareTo(list.get(0))!=0 && list1.get(0).compareTo(list.get(1))==0 && list1.get(0).compareTo(list.get(2))==0){
            return list1.get(1);
        }  else if (list1.get(0).compareTo(list.get(1))==0 && list1.get(0).compareTo(list.get(1))!=0 && list1.get(0).compareTo(list.get(2))!=0 ){
            return list1.get(0);
        }
        return list1.get(0);
    }
//        Set<Double> set=new HashSet<>(list);
//        ArrayList<Double> list1=new ArrayList<>(set);
//        System.out.println(list);
//        System.out.println(list1);
//        for (int i=0; i<list.size();i++){
//            for(int j=0; j<list1.size(); j++){
//                if (list.get(i).compareTo (list1.get(j))==0){
//                    list.remove(i);
//                }
//            }
//        }
//        if (list1.get(0).equals(list.get(0))) {
//            return list1.get(1);
//        } else if (list1.get(1).equals(list.get(0))) {
//            return list1.get(0);
//        } else {
//            return list1.get(0);
//        }
 //  }
//    public static double findUniq(double[] arr) {
//
//        List<Double> list = DoubleStream.of(arr).boxed().sorted().collect(Collectors.toList());
//
////        Set<Double> set = new HashSet<>(list);
//        ArrayList<Double> list1 = new ArrayList<>(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 1; j < list.size(); j++) {
//                if (list.get(i).compareTo (list.get(j))==0) {
//                    list.remove(i);
//                }
//            }
//        }
//        System.out.println(list);
//        System.out.println(list1);
//        double otv=0;
//        for (int i = 0; i<2; i++) {
//            for (int j = 1; j < list1.size(); j++) {
//                if (list1.get(i).compareTo (list.get(j))==0) {
//                    list.remove(i);
//                }
//            }
//        }
//
////        if (list.get(0).compareTo(list.get(1))==0 && list.get(0).compareTo(list.get(2))==-1) {
////            return list.get(1);
////        } else if (list.get(1).equals(list.get(0))) {
////            return list.get(0);
////        } else {
////            return list.get(0);
////        }
//        return otv;
//    }

    public static void main(String[] args) {
        double[] array = new double[]{0.0, 1.0, 0.0};
        System.out.println(findUniq(array));

    }
}
