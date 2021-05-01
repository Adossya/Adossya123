package udemy.lesson5;

public class SpecialFor {
    String name;
    String suname;
    double grn;
    double usd;
    double euro;
    double scitaem;
    double sred (SpecialFor ez){
        scitaem =(ez.grn+ez.euro+ez.usd)/3;
        return scitaem;
    }
}
class Dimka {
    public static void main(String[] args) {
        SpecialFor sp=new SpecialFor();
        sp.usd=27.77;
        sp.euro=32.40;
        sp.grn=2.02;
        sp.sred(sp);
        double a=sp.sred(sp);
        System.out.println(a);


    }
}