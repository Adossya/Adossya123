package udemy.lesson32DataIVremya;
import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDate ld1=LocalDate.of(2013,5,3);
        LocalDateTime ldt=LocalDateTime.of(2016,Month.APRIL,1,16,40);
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getMonth());
    }
}
