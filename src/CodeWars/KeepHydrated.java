package CodeWars;

public class KeepHydrated {
    public int Liters(double time) {
        double water = time * 0.5;

        double result=Math.floor(water);
        int a=(int)result;

        return a;

    }

    public static void main(String[] args) {
        KeepHydrated r1=new KeepHydrated();
        System.out.println(r1.Liters(11.8));
    }
}
