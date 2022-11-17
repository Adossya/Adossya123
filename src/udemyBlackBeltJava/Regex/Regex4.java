package udemyBlackBeltJava.Regex;

import java.util.regex.Pattern;

public class Regex4 {
    void checkIP (String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                    "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
// ((25[0-5]   |    2[0-4]\d    |  [01]?\d?\d)    (\.))             {3}
// 250-255     |    200-249     | 0-1 9 9         точка  три раза повторяется

        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }


    public static void main(String[] args) {
        String ip1 = "192.168.1.1";
        String ip2 = "182.262.91.05";
        Regex4 r4 = new Regex4();
        r4.checkIP(ip1);
        r4.checkIP(ip2);

    }
}
