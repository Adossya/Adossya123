package CodeWars;

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears){
        int old=dadYears-sonYears;
        int razn=old*2;
        int otv=razn-dadYears;


        return otv>0?otv:-otv;}



    public static void main(String[] args) {
        System.out.println(TwiceAsOld(36,7));
    }
}
