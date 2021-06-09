package udemy.lesson18;
import java.util.Arrays;

public class Home1work18 {
    public static void sortirovka (int [] massive){
        Arrays.sort(massive);

        for (int i=0; i<massive.length;i++){
            System.out.print(massive[i]+" ");
        }

    }
/*    public static void sortirovka2 (int [] massive){
        int min=massive[0];
        for (int i=0;i<massive.length;i++){


            if (massive[i]<min){
                min=massive[i];
                massive[0]=min;
             }
            if (massive[i]<min){
                min=massive[i];
                massive[1]=min;
            }

            System.out.print(massive[i]+" ");



            System.out.print(massive[i]+" ");
        }

    }*/


    public static void main(String[] args) {

        sortirovka(new int [] {1,45,-1,3,7,9,0,7});
        System.out.println();
       // sortirovka2(new int [] {1,15,-15,3,7,9,0,7});
    }
}
