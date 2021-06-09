package udemy.lesson18;

public class Home2work18 {
    public static void showArray (String [][] array){
        for (int i=0; i<array.length;i++){

            System.out.print("{"+array[0][0]+", "+array[0][1]+"}, "+"{"+array[1][0]+"}, "+"{"+array[1][0]+", "+array[1][1]+"}");
        }



    }


    public static void main(String[] args) {
        String [][]array1=new String[2][2];
        array1[0][0]="lol";
        array1[0][1]="dom";
        array1[1][0]="komp";
        array1[1][1]="romb";
        showArray(array1);
    }
}
