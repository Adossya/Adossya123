package udemy.lesson32DataIVremya;
import java.time.*;

public class Test3 {
    public static void main(String[] args) {


    LocalDate ld1=LocalDate.of(2014,5,15);
    LocalDate ld2=LocalDate.of(2012,5,15);
        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld1.isBefore(ld2));

    LocalDate ld22=LocalDate.of(2014,Month.AUGUST,15);

    LocalDateTime ldt1=LocalDateTime.of(2014,Month.APRIL,27,17,25);
}}
