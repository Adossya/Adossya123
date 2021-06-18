package CodeWars;

public class CatsAndDogs {
    public static void main(String[] args) {
        int [] array=(humanYearsCatYearsDogYears(2));
        for (int a:array){
            System.out.print(a+" ");
        }
    }
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears=0;
        int dogYears=0;
        for (int i=1;i<=humanYears;i++){
            if (humanYears==1){catYears=15;dogYears=15;}
            if (humanYears==2){catYears=24;dogYears=24;}
            if (humanYears>=3){catYears=24+(humanYears-2)*4;dogYears=24+(humanYears-2)*5;}

        }
        int [] humanYearsCatDog={humanYears,catYears,dogYears};
        return humanYearsCatDog;
    }


}
