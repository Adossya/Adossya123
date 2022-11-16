package CodeWars;

public class StringToNumber {
    public static int stringToNumber(String str) {
                return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(stringToNumber(s));
    }
}
