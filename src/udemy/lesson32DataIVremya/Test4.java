package udemy.lesson32DataIVremya;
import java.time.*;

public class Test4 {
    static void smenaDejurnogo (LocalDate nachalo, LocalDate konec, Period p){
        LocalDate data=nachalo;
        while (data.isBefore(konec)){
            System.out.println("Nastupila data "+data+". Pora menyat' dejurnogo");
            data=data.plus(p);

        }
    }

    public static void main(String[] args) {
        LocalDate nachalo=LocalDate.of(2021,Month.SEPTEMBER,1);
        LocalDate konec = LocalDate.of(2022,Month.MAY,31);
        Period p=Period.ofMonths(2); //.of ; .ofDays; .ofYears;
        smenaDejurnogo(nachalo,konec,p);
    }
}
