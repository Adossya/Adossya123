package udemy.lesson31ErrorsPart1;

public class test3 {
    public static void main(String[] args) {
        int [] array={4,8,11,4,5,4};
        System.out.println("U nas est massiv");

        try {

            System.out.println(array[5]);
            System.out.println("horoshego dn9");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Bil poyman expection");
        }

    }
}
