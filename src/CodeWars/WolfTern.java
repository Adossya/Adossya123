package CodeWars;
import java.util.Arrays;
public class WolfTern {

    public static String warnTheSheep(String[] array) {
        int wolf=Arrays.asList(array).indexOf("wolf");
        return wolf==array.length-1? "Pls go away and stop eating my sheep":"Oi! Sheep number " +
                (array.length-wolf-1) +"! You are about to be eaten by a wolf!";
    }

    public static void main(String[] args) {
        String [] specialForDmitriy={"wolf","sheep","sheep","sheep","sheep","sheep","sheep"};
        System.out.println(warnTheSheep(specialForDmitriy));
    }
}
