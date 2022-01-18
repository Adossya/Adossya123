package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class SixteenAndEighteen {
    public static int add(int num1,int num2){
        int dlinna=0;
        String s1=Integer.toString(num1);
        String s2=Integer.toString(num2);
        if (s1.length()>s2.length()){
            dlinna=s1.length();
            } else {
                dlinna=s2.length();
            }
        char [] char1=s1.toCharArray();
        char [] char2=s2.toCharArray();

        ArrayList <Character> list1=new ArrayList<>(char1.length);
        ArrayList <Character> list2=new ArrayList<>(char2.length);
        for (int i=0; i<char1.length; i++){
            list1.add(char1[i]);
        }
        for (int i=0; i<char2.length; i++){
            list2.add(char2[i]);
        }
        for (int i=0; i<dlinna; i++){
            if (list1.size()>list2.size()){
                list2.add(0,'0');
            } else if (list1.size()<list2.size()){
                list1.add(0,'0');
            }
        }
         List <Integer> list3=new ArrayList<>();
        for (int i=0; i<dlinna; i++){
            list3.add(Character.getNumericValue(list1.get(i))+Character.getNumericValue(list2.get(i)));
        }
        StringBuilder pzdc= new StringBuilder();
        for (int num : list3)
            {
            pzdc.append(num);
            }
        int finalInt = Integer.parseInt(pzdc.toString());

        return finalInt;
    }

    public static void main(String[] args) {
        int a,b;
        a=26;
        b=39;
        System.out.println(add(a,b));
    }
}
//
