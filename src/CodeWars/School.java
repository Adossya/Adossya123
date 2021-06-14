package CodeWars;

public class School {

    public static int getAverage(int[] marks){
        int avarage1=0;
        int summa=0;
        for (int avarage:marks){
            summa+=avarage;

        }
        return avarage1=summa/marks.length;

    }

    public static void main(String[] args) {
        int [] array={1,5,4,8,3};
        System.out.print(getAverage(array)+" ");



    }
}
