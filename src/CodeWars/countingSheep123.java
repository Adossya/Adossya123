package CodeWars;
import java.util.Scanner;

public class countingSheep123 {
    public static String countSheep(int num) {
        String s1 = "";
        for (int i = 1; i <= num; i++) {
            s1 += i + " sheep...";
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println(countSheep(i));
    }
}
