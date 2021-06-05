package CodeWars;

public class Remove8q {
    public static String remove(String str) {
        StringBuilder sb1=new StringBuilder(str);
        sb1.delete(0,1);
        sb1.delete(sb1.length()-1,sb1.length());
        str=sb1.toString();
        return str;
    }

    public static void main(String[] args) {
        System.out.println(remove("It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string."));

    }
}
