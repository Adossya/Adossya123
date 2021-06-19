package udemy.lesson20;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Homework20 {
    public static ArrayList<String> abc(String []... array){

        ArrayList <String> list1=new ArrayList<>();
                    for (String [] a:array){
                        for (String s1:a){
                            if (!list1.contains(s1))
                            list1.add(s1);}
                        }
        Collections.sort(list1);
        return list1;
    }

    public static void main(String[] args) {
        String [] array1={"Dima","Vasya","Anton","Karina","Tanya","Dima"};
        String [] array2={"Dima","Vasya","Anton"};
        String [] array3={"Dima","Vasya","Anton","Evlampiy"};
        String [] array4={"Dima","Dima","Dima","Dima"};
        System.out.println(abc(array1,array2,array3,array4,array4,array4,array4));
    }
}
