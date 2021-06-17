package CodeWars;

public class OverTheRoad {

    public static long overTheRoad(long address, long n) {
        int a=(int)n;
        long l=address;
        long [] array=new long [a];
        long p=address;
        long p1=address;
        long q=100;
        for (int i=0;i<n;i++,l+=2){
            array[i]=(int)l;
        }

                     for (int i = 0; i <array.length/2; i++) {
                            long tmp = array[i];
                            array[i] = array[array.length - i - 1];
                            array[array.length - i - 1] =tmp;}


        long [] array1=new long [a];
                     for (int k=0;k<array1.length;k++,p+=2){
                            array1[k]=(int)p+1;}

        long [] array3=new long [a];
                     for (int i=0;i<n;i++,p1+=2){
                            array3[i]=(int)p1;}


        int dima=0;
                     for (int k1=0;k1<array3.length;k1++){
                            if (address==array3[k1]){dima=k1;}}



                     for (int i=dima;i<array1.length;i++){
                         q=array1[i];}

        for (long eqwe:array){
            System.out.print(eqwe+" ");
        }
        System.out.println();
        for (long da:array1){
            System.out.print(da+" ");
        }
        System.out.println();

        return q;
    }

    public static void main(String[] args) {
        System.out.println(overTheRoad(2,3));
    }
}
