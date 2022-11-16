package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneWords {
    public static String phoneWords(String str) {
        List <Character> Suka = new ArrayList<>();
        char [] Words = str.toCharArray();
        String PhoneWord1 = "";
        String local = "";
        for (int i = 1; i < str.length(); i++){
            if (Words[i] != Words[i-1] ){
                Suka.add(Words[i-1]);
                Suka.add(' ');
            } else if (Words[i] == Words[i-1]){
                Suka.add(Words[i]);
            }

            switch (Words[i]){
                case '1': PhoneWord1+=' '; break;
                case '2': PhoneWord1+='a'; break;
                case '3': PhoneWord1+='d'; break;
                case '4': PhoneWord1+="g"; break;
                case '5': PhoneWord1+="j"; break;
                case '6': PhoneWord1+="m"; break;
                case '7': PhoneWord1+="p"; break;
                case '8': PhoneWord1+="t"; break;
                case '9': PhoneWord1+="w"; break;
                default:
                    break;
                }

        }
        System.out.println(""+Suka);
        return PhoneWord1;

        // 443355555566604466690277733099966688 -> hello how are you;
    }

    public static void main(String[] args) {
        System.out.println(phoneWords("416666663105558822255"));
    }
}
