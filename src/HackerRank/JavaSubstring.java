package HackerRank;
import java.util.Scanner;
public class JavaSubstring {
    public static String returned (String s, int start, int end){
        String s1=s.substring(start,end);
        return s1;

    }

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        String s=sca.nextLine();
        int start=sca.nextInt();
        int end=sca.nextInt();
        System.out.println(returned(s,start,end));
    }
}
