import java.io.*;
import java.time.*;

public class DataTime  {

    public static String findDay(int month, int day, int year) {
        LocalDate ld1=LocalDate.of(year,month,day);
        return ""+ld1.getDayOfWeek()+"";
    }

    public static void main(String[] args) {
        int year=2015;
        int month=5;
        int day=15;
        System.out.println(findDay(month,day,year));
        int a=' ';
        System.out.println(a);
    }
}

