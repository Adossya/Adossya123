package udemy.lesson32DataIVremya;


import java.time.*;
import java.time.format.*;

public class Homework {
    DateTimeFormatter d4=DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
    DateTimeFormatter d5=DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");
    void smena (LocalDateTime ldt1, LocalDateTime ldt2, Period p1, Duration d1){
        do {
            System.out.print("Работаем с: "+ ldt1.format(d4));
            System.out.println(" До: "+ldt1.plus(p1).format(d4));
            System.out.print("Отдыхаем с: "+ldt1.format(d5));
            System.out.println(" До: "+ldt1.plus(d1).format(d5));
        }while (ldt1.isBefore(ldt2));
    }

    public static void main(String[] args) {
        LocalDateTime ldt1=LocalDateTime.of(2014,Month.APRIL,27,17,25);
        LocalDateTime ldt2=LocalDateTime.of(2015,Month.SEPTEMBER,13,12,10);
        Period p1=Period.of(0,1,3);
        Duration d1=Duration.ofMinutes(600);
        Homework h1=new Homework();
        h1.smena(ldt1,ldt2,p1,d1);
    }
}
