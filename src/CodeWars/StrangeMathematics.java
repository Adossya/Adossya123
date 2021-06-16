package CodeWars;
import udemy.p1.A;

import java.sql.Array;
import java.util.Arrays;



public class StrangeMathematics {


    public static int mathematics(int n, int k){
        int [] array=new int[n];
        array[0]=1;
        int d=2;
        for (int i=0;i<n && n>=1 && n<=100_000 ;i++) {

            if (n>=10) {
                for (int j = 10; j <=n && n >= 1 && n <= 100_000; j++) {
                    array[j-9]=j;
                                        }
                }

            if (array[i]==0){

                array[i]=d++;

            }
            }
        int dima=0;
        for (int l=0;l<array.length;l++){
            if (k==array[l]){dima=l;}
        }


        for (int a:array){
            System.out.print(a+" ");
        }

        return dima+1;
    }

    public static void main(String[] args) {

        System.out.println(mathematics(11,2));
    }
}
