package CodeWars;

public class School {

    public static int getAverage(int[] marks){
        int avarage1=0;
        int summa=0;
        for (int avarage:marks){
            avarage1=(summa+=avarage)/marks.length;

        }
        return avarage1;

    }

    public static void main(String[] args) {
        int [] array={5,5,5,5,5};
        System.out.print(getAverage(array)+" ");



    }
}
