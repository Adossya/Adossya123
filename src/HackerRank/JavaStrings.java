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
        String s1=A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1);
        return s1;
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String A =s1.nextLine();
        String B =s1.nextLine();
        System.out.println(sumLength(A,B));
        sravnenie(A,B);
        System.out.println(upperCase(A,B));
    }
}
