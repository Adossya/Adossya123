package udemy.lesson18;
import java.util.Arrays;

public class Home1work18 {
    public static void sortirovka (int [] massive){
        Arrays.sort(massive);
        System.out.println(Arrays.toString(massive));



    }
        public static int [] sortirovka2 (int [] massive){

        int a;
        for (int i=0;i<massive.length;i++){
                int min=massive[i];
                int index=i;
                for (int j=i+1;j<massive.length;j++){
                    if (massive[j]<min){
                        min=massive[j];
                        index=j;
                    }
                }
                if (i !=index){
                    a=massive[i];
                    massive[i]=min;
                    massive[index]=a;

                }

        }
        return massive;

    }


    public static void main(String[] args) {

        sortirovka(new int [] {1,45,-1,3,7,9,0,7});
         System.out.println();
        int []array={1,45,-15,3,8,9,0,7};
        sortirovka2(array);
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
