package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class HowManyArguments {

    public static int countArgs (Object... args){
      //  List <Object> pzdc1 = Arrays.asList(args);
      //  int count = (int)pzdc1.stream().count();
        return (int) Arrays.asList(args).stream().count();



    }



    public static void main(String[] args) {
        List<Object> list =List.of(1, 2, "uhsaf uas",3,5,6,7,8,9,5,2);

        int a=countArgs(list,1,3,4,6,7);
        System.out.println(a);
    }
}
