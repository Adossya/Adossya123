package CodeWars;

public class PersistentBugger {
    public static int persistence(long n) {
        int count = 0;
        int sum = (int) n;
        otsuda:
        while (sum > 9) {
            System.out.println(sum + " whasssup");
            count += 1;
            char[] array = Integer.toString(sum).toCharArray();
            sum = 1;
            for (int i = 0; i < array.length; i++) {
                sum *= Character.getNumericValue(array[i]);
            }
            continue otsuda;
        }
        return count;
    }

    public static void main(String[] args) {
        long l = 999;
        System.out.println(persistence(l));
    }
}
