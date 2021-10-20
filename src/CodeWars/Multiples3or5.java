package CodeWars;

public class Multiples3or5 {

    public static int solution(int number) {
        int summa=0;
        for (int i=0;i<number;i++){
            if (i%3==0 || i%5==0){summa+=i;}
        }
        return summa;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
