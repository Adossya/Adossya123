package CodeWars;

public class Bol1 {
    public static String boolToWord(boolean b)
    {
        String s="";
        if (b==true){s="Yes";}else{s="No";}
        return s;
    }

    public static void main(String[] args) {
        System.out.println(boolToWord(true));
    }
}
