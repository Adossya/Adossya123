package CodeWars;

public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        int a=0;
        int b=0;
        for (int i = 0; i < args.length; i++) {
            for (int j = 1; j < args.length; j++) {
                if (args[i] > args[j]) {
                    args[i] =a;
                    args[i] = args[j];
                    args[j] = a;
                }

            }
            b=args[0];
        }
        return b;
    }



    public static void main(String[] args) {
        int [] array1={78, 56, 232, 12, 11, 43};
        System.out.println(findSmallestInt(array1));
    }
}