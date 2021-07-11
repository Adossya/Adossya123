package CodeWars;

public class WideFrog {
    public static String mouthSize(String animal){

        return animal=="alligator"|| animal=="ALLIGATOR"?"small":"wide";
    }
    public static void main(String[] args) {
        System.out.println(mouthSize("ALLIGATOR"));
    }
}

