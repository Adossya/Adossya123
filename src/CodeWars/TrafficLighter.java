package CodeWars;

public class TrafficLighter {

    public static String updateLight(String current) {
        String s1="";
        if (current=="green"){ s1="yellow";}
        if (current=="yellow"){ s1="red";}
        if (current=="red"){ s1="green";}
        return s1;
    }


    public static void main(String[] args) {
        System.out.println(updateLight("green"));
    }
}
