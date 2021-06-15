package CodeWars;
import java.util.Arrays;
public class TakeArray {
    public static int[] take(int[] arr, int n)  {

        int [] array;
        if (n> arr.length){n=arr.length;}
        array=Arrays.copyOfRange(arr,0,n);

        return array;
    }



    public static void main(String[] args) {
        int [] array={0, 1, 2, 3, 5, 8, 13};
        System.out.println(take(array,0));

    }

}

