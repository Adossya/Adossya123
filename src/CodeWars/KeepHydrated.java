package CodeWars;

public class KeepHydrated {
    public int Liters(double time) {
        double water = time * 0.5;

        double result=Math.floor(water);
        int a=(int)result;

        return a;

    }
    public int Liters2(double time){

        return time>0? (int)Math.floor(time * 0.5):0;
    }

    public static void main(String[] args) {
        KeepHydrated r1=new KeepHydrated();
        System.out.println(r1.Liters(11.8));
        System.out.println(r1.Liters2(11.8));
     }
}
