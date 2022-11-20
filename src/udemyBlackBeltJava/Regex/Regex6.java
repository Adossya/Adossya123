package udemyBlackBeltJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {
    public static void main(String[] args) {
        String myString = "12334567883356780626457" + "12334567223744400123111" + "12334245000112330122444";
        // 1233424500011233 01/22 (444)

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7) ");
//        System.out.println(myNewString);

        while (matcher.find()){
            System.out.println(matcher.group(7));
        }
    }
}
