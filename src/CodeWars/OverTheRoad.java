package CodeWars;

public class OverTheRoad {

    public static long overTheRoad(long address, long n) {
        long l=1;
        long [] array5=new long [(int)n];
        long q=0;

                     for (int i=0;i<array5.length;i++,l+=2){
                            array5[i]=l;
                     }

                     for (int i = 0; i <array5.length/2; i++) {
                            long tmp = array5[i];
                            array5[i] = array5[array5.length - i - 1];
                            array5[array5.length - i - 1] =tmp;}

                     long [] array1=new long [(int)n];
                     long p=2;
                     for (int k=0;k<array1.length;k++,p+=2){
                            array1[k]=(int)p;}

                     int dima=0;
                     for (int k1=0;k1<array5.length;k1++) {
                         if (address == array5[k1]) {
                             dima = k1;
                         }
                         if (address == array1[k1]) {
                             dima = k1;
                         }
                     }

                     for (int i=0;i<array1.length;i++){
                         if (address%2==0){q=array5[dima];}
                         if (address%2==1){q=array1[dima];}
                     }

        return q;
    }

    public static void main(String[] args) {
        System.out.println(overTheRoad(2,3));
    }
}
