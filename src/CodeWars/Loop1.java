package CodeWars;

public class Loop1 {
    public static String repeatStr(final int repeat, final String string) {
        String s1="";
        s1=string.repeat(repeat);
        return s1;
}

    public static void main(String[] args) {
        System.out.println(repeatStr(18,"b"));

    }


}
