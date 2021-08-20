package CodeWars;

public class Watermelon {
    public static boolean divide(int weight) {
        System.out.println(weight);
        boolean b1=true;
        if (weight==2){b1=false;}
        if (weight%2==0){b1=true;}
        if (weight%2==1){b1=false;}
        return b1;
    }

    public static void main(String[] args) {
        int ves=90;
        System.out.println(divide(ves));
    }
}
