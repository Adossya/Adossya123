package CodeWars;

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        threshold=content/100*threshold;
        int days=0;
        for (content=content; content>threshold; days++){
            content=content-(content/100*evap_per_day);
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10, 10, 10));
    }
}
