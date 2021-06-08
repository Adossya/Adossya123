package HackerRank;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        if (n>=-100 && n<=100){
            System.out.println("Good job");
        } else {System.out.println("Wrong answer");}
    }
}
