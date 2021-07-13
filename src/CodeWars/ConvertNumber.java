/*
package CodeWars;

public class ConvertNumber {
    public static int[] digitize(int n) {

        int [] array=new int [];
        for (int i = 0; i <array.length/2; i++) {
            long tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =tmp;}
        for (long a:array){
            System.out.print(a+" ");
        }
        return new int[2];
    }

    public static void main(String[] args) {
        System.out.println(digitize(35231));
    }
}
*/
