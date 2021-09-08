package CodeWars;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] array2 = numbers.split(" ");
        int[] a = new int[array2.length];
        String result="";
        for (int i = 0; i < array2.length; i++) {
            a[i] = Integer.parseInt(array2[i]);
        }
        for (int i = 0; i < a.length-1; i++) {
            for (int j=0; j < a.length-1; j++){
               if (a[i]>a[j]) {
                    int k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                   System.out.println(a[i]+" "+a[j]);
               }
            result=a[0]+" "+a[a.length-1];
            }}
        return result;
        }




    public static void main(String[] args) {
        String s = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
       // System.out.println(highAndLow(s));
        highAndLow(s);
    }
}
