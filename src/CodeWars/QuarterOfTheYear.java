package CodeWars;

public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        if (month <=3 && month>=1){ month=1;}
        if (month <=6 && month>=4){ month=2;}
        if (month <=9 && month>=7){ month=3;}
        if (month <=12 && month>=10){ month=4;}



        return month;
    }



    public static void main(String[] args) {
        System.out.println(quarterOf(3));

    }
}
