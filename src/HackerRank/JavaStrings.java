package HackerRank;
import java.util.Scanner;

public class JavaStrings {
    public static int sumLength (String A, String B) {
        int a1 = A.length() + B.length();
        return a1;
    }
    public static void sravnenie (String A, String B){
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public static String upperCase (String A, String B){
        String s1=A.toUpperCase();
        System.out.println(s1);
        return "1";
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String A =s1.nextLine();
        String B =s1.nextLine();
        System.out.println(sumLength(A,B));
        sravnenie(A,B);
        upperCase(A,B);
    }
}
