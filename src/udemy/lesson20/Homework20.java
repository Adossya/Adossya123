package udemy.lesson20;

import java.util.Arrays;
import java.util.ArrayList;

public class Homework20 {
    public static String [] abc(String []... array){

        ArrayList <String> list1=new ArrayList<>();
                    for (String [] a:array){
                        for (String b:a){
                            list1.add(b);}
                        }

                    for (int i=0;i<list1.size();i++){
                        for (int j=i+1;j<list1.size();j++){
                                if (list1.get(i).compareTo(list1.get(j))==0 && j>0){
                                list1.remove(j);j=j-1;}
                        }
                    }

        return list1.toArray(new String[list1.size()]);
    }

    public static void main(String[] args) {
        String [] array1={"Dima","Vasya","Anton","Karina","Tanya","Dima"};
        String [] array2={"Dima","Vasya","Anton"};
        String [] array3={"Dima","Vasya","Anton","Evlampiy"};
        String [] array4={"Dima","Dima","Dima","Dima"};
        System.out.println(Arrays.toString(abc(array1,array2,array3,array4,array4,array4,array4)));
    }
}
