package udemyBlackBeltJava.Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE AVCFAVCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");
//        String s1 = "OPABMNCD";
//        Pattern pattern1 = Pattern.compile("[ABC]");
//        String s1 = "ABCOPABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP"); // AB потом любая буква из диапазона C-F и дальше OP
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]"); // ^ - cимвол отрицание (не из этих диапазонов)
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)"); // | - или
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc5abcg6abch$"); // $ - проверяет конец строки, а ^ - проверяет начало строки
//        String s1 = "abcd1 abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D"); // Метасимвол \\d - ищет число, \\D - ищет НЕ число
//        String s1 = "abcd1 abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w"); // \\w - любой символ, равен [A-Za-z0-9_], а \\W соотвествует любому символу, который НЕ буква, НЕ цифра и НЕ _
//        String s1 = "abcd1 abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d+");

            String s1 = "4416666663105558822255";
            String [] s =s1.split("1{1,3}|2{1,3}|3{1,3}|4{1,3}|5{1,3}|6{1,3}|7{1,4}|8{1,3}|9{1,4}|0{1,}");
            for (String s2:s){
                System.out.print(s2);
            }
//            List <String> list = new ArrayList<>(100000);
//            String [] som =new String[s1.length()];
//            Pattern pattern1 = Pattern.compile("1+|2+|3+|4+|5+|6+|7+|8+|9+|0+");
//            Matcher matcher = pattern1.matcher(s1);
//
//            System.out.println(Arrays.asList(list));
//
//            while (matcher.find()){
//                System.out.println("Position: " + matcher.start() + " это регулярка   " + matcher.group());
//              som[matcher.start()]=matcher.group();
//            }
//            for (String s:som){
//                System.out.println(s);
//            }
        }

    }

