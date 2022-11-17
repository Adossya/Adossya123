package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneWords {
    public static String phoneWords(String str) {
        if (str==null) return "";
        String [] Words = new String[str.length()];
        String PhoneWord1 = "";

        Pattern pattern1 = Pattern.compile("1{1,3}|2{1,3}|3{1,3}|4{1,3}|5{1,3}|6{1,3}|7{1,4}|8{1,3}|9{1,4}|0{1,}");
        Matcher matcher = pattern1.matcher(str);

        while (matcher.find()){
            Words[matcher.start()] = matcher.group();
        }

        List <String> NoNulls=new ArrayList<>(Arrays.asList(Words));
        while (NoNulls.remove(null));
        System.out.println(Arrays.asList(NoNulls));
        for (int i = 0; i < NoNulls.size(); i++){
            switch (NoNulls.get(i)){
                case "1": PhoneWord1+=""; break;
                case "11": PhoneWord1+=""; break;
                case "111": PhoneWord1+=""; break;
                case "2": PhoneWord1+='a'; break;
                case "3": PhoneWord1+='d'; break;
                case "4": PhoneWord1+='g'; break;
                case "5": PhoneWord1+="j"; break;
                case "6": PhoneWord1+="m"; break;
                case "7": PhoneWord1+="p"; break;
                case "8": PhoneWord1+="t"; break;
                case "9": PhoneWord1+="w"; break;
                case "0": PhoneWord1+=" "; break;
                case "00": PhoneWord1+="  "; break;
                case "000": PhoneWord1+="   "; break;
                case "22": PhoneWord1+='b'; break;
                case "33": PhoneWord1+='e'; break;
                case "44": PhoneWord1+='h'; break;
                case "55": PhoneWord1+="k"; break;
                case "66": PhoneWord1+="n"; break;
                case "77": PhoneWord1+="q"; break;
                case "88": PhoneWord1+="u"; break;
                case "99": PhoneWord1+="x"; break;
                case "222": PhoneWord1+='c'; break;
                case "333": PhoneWord1+='f'; break;
                case "444": PhoneWord1+='i'; break;
                case "555": PhoneWord1+="l"; break;
                case "666": PhoneWord1+="o"; break;
                case "777": PhoneWord1+="r"; break;
                case "888": PhoneWord1+="v"; break;
                case "999": PhoneWord1+="y"; break;
                case "7777": PhoneWord1+="s"; break;
                case "9999": PhoneWord1+="z"; break;
            default:
                break;
            }
        }
        return PhoneWord1;
    }

    public static void main(String[] args) {
       System.out.println(phoneWords("5525566644404330733818844033866607177744438862555"));

    }
}

