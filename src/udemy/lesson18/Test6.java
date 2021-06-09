package udemy.lesson18;

public class Test6 {
    public static void maxMin (double [] array){
        double max=array[0];
        double min=array[0];
        for (int i=1;i<array.length;i++){

            if (array[i]>max){
                max=array[i];
            }
            if (array[i]<min){
                min=array[i];
            }

        }
        System.out.println("Min el massiva " + min+ " Max elem massiva "+ max);
    }



    public static void main (String[] args){
        double [] array1={1,4,6,8,65,4,3,3};
        maxMin(array1);
        maxMin(new double[]{0,7,1,3,3,4,3,3});
    }
}
