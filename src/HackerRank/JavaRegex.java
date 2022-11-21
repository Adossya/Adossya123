package HackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches("((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                    "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)"));
        }

    }
}
