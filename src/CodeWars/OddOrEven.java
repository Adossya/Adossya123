package CodeWars;

public class OddOrEven {

        public static String oddOrEven (int[] array) {
            int summa=0;
            for (int a:array){
                summa+=a;
            }

            return summa%2==0? "even":"odd";
        }


    public static void main(String[] args) {
        oddOrEven(new int[] {2, 5, 34, 6});
    }
}
