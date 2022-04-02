package CodeWars;

public class ConvertAStringToAnArray {
    public static String[] stringToArray(String s) {
        String [] str=s.split(" ");
        return str;
    }


    public static void main(String[] args) {
        String s1="Robin Singh";
        stringToArray(s1);
    }
}
