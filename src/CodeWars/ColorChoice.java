package CodeWars;

import java.math.BigInteger;

public class ColorChoice {
    public static long checkchoose(long m, int n) {
        BigInteger posters = BigInteger.valueOf(m);
        BigInteger PolPosters = BigInteger.ZERO;
        int check = 1;

        try {
            for (int x = 1; x <= posters.intValue(); x++) {
                if (x > n) {
                    return -1;
                } else if (posters.compareTo(BigInteger.valueOf(n)) < 0) {
                    return m;
                }

                PolPosters = BigInteger.ZERO;
                PolPosters = factorial(n).divide(factorial(x).multiply(factorial(n - x)));
                check = x;

                if (posters.longValue() <= PolPosters.longValue()) {
                    System.out.println("tut");
                    return check;
                }
            }
            return check;
        } catch (ArithmeticException e) {
            System.out.println("exception");
            return -1;
        }
    }


    public static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args) {
        long posters = 12377L;
        int colors = 17;
        System.out.println(factorial(colors) + " factorial");
        System.out.println(factorial(16) + " factorial");
        System.out.println(checkchoose(posters, colors));
    }
}
