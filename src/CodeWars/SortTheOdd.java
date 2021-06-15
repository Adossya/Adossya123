package CodeWars;

public class SortTheOdd {

        public static int[] sortArray(int[] array) {
            int a=0;
            for (int i=0;i<array.length;i++){
                for (int j=i+1;j<array.length;j++){
                    if (array[i]%2==1 && array[j]%2==1 && array[i]>array[j]){
                        a=array[i];
                        array[i]=array[j];
                        array[j]=a;
                    }


                }
            }



            return array;
        }



    public static void main(String[] args) {
        int [] array={9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int []array1=sortArray(array);
        for (int a:array1){
            System.out.print(a+" ");
        }
    }
}
