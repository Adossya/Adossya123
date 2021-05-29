package HackerRank;
import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int i=1;
        for (int N=a;N>=2 && N<=20 && 1<=i && i<=10;i++){
              int result=N*i;
            System.out.println(N+" x "+i+" = "+result);

    }
}
}
