package CodeWars;

public class ThinkfulStringDrillsRepeater {
    public static String repeat(String string,long n){
        String s1="";

        for (int i=0;i<n;i++){
          s1=s1.concat(string);
        }

        return s1;
    }

    public static void main(String[] args) {
        System.out.println(repeat("a",5));
    }
}
