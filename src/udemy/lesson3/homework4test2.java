package udemy.lesson3;

public class homework4test2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        int z = a-- - --a + ++a +a ++ + a;
        int x = ++b - b++ + ++b - --b;

        System.out.println(z);
        System.out.println(x);

    }
}
