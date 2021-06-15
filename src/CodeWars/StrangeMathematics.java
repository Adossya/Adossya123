package CodeWars;
import java.util.Arrays;
public class StrangeMathematics {


    public static int mathematics(int n, int k){
        int [] array=new int[n];

        for (int i=0;i<n && n>=1 && n<=100_000 ;i++) {
            array[i] = i + 1;
            }
        for (int i=0;i<n-1 && n>=1 && n<=100_000;i++) {
            array[i]=array[i+1];
        }

        for (int a:array){
            System.out.print(a+" ");
        }

        return 1;
    }

    public static void main(String[] args) {

        System.out.println(mathematics(19,5));
    }
}
