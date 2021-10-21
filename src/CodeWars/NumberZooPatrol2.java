package CodeWars;

public class NumberZooPatrol2 {
    public static int findMissingNumber(int[] numbers) {
        int result = 1;
        for (int i = 2; i <= (numbers.length + 1); i++) {
            result += i;
            result -= numbers[i - 2];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8}));
    }
}
