package CodeWars;

public class KeepUpTheHoop {

    public static String hoopCount(int n){
        String s1="";
        if (n>=0 && n<=10){s1="Keep at it until you get it";}
        if (n>=10){s1="Great, now move on to tricks";}

        return s1;
    }




    public static void main(String[] args) {
        System.out.println(hoopCount(10));
    }
}
