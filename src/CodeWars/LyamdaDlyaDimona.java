package CodeWars;

public class LyamdaDlyaDimona {
    public static void main(String[] args) {
    Calculator c;
        int a=4;
        int b=2;

        c=(x, y) -> {return x + y;};
        System.out.println(c.Calculator(a,b));
        c=(x, y) -> {return x * y;};
        System.out.println(c.Calculator(a,b));
        c=(x, y) -> {return x / y;};
        System.out.println(c.Calculator(a,b));
        c=(x, y) -> {return x-y;};
        System.out.println(c.Calculator(a,b));
    }

}

interface Calculator {
   int Calculator (int a,int b);
}
