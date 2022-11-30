package CodeWars;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindingArrowsInAString {
    public static int searchArrows(String string) {
        int counter = 0;
        Pattern p = Pattern.compile(">|>?={1,}|<?|<?-{1,}");
        Matcher m = p.matcher(string);
        while (m.find()){
            System.out.println(m.group());}


        return counter;
    }

    public static void main(String[] args) {
        String s1 = "><=><--";
        System.out.println(searchArrows(s1));
    }
}
