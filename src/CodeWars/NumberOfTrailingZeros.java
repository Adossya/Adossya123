package CodeWars;

public class NumberOfTrailingZeros {
    public static int zeros(int n) {
        int factorial =1;
        int skoknuley=0;
        for (int i=1; i <= n; i++){
            factorial=factorial*i;
        }
        char [] zeroes1=Integer.toString(factorial).toCharArray();
        for (int i = zeroes1.length-1; i < zeroes1.length; i--){
            if (zeroes1[i]=='0'){
                skoknuley+=1;
            } else {break;}
        }
        for (char a:zeroes1){
            System.out.print(a+" ");
        }
        System.out.println("= factorial");
        return skoknuley;
    }

    public static void main(String[] args) {
        int zeros = 7; // max 31 - дальше int не вывозит;
        System.out.println(zeros(zeros));
    }
}
