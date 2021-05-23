package udemy.lesson8;

public class Homework81 {
    static final double Pi=3.14;
    double Ploshad (double a, double b){
        double S=Pi*a*b;
        /*System.out.println("Ploshad ravna: "+S);*/
        return S;
        }
    static double Dlinna_okrugnosti (double a){
        double dlinna=2*Pi*a;
        /*System.out.println("Dlinna okrugnosti ravna: "+dlinna);*/
        return dlinna;
        }
    void showInfo (double d){
        System.out.println("Radius: "+d+" Kruga ploshad ravna: "+Ploshad(3,4)+" Dlinna okrugnosti: "+Dlinna_okrugnosti(3));
    }
}
class Homework82 {
    public static void main(String[] args) {
        Homework81.Dlinna_okrugnosti(3);
        Homework81 h1=new Homework81();
        h1.Ploshad(5,4);
        h1.showInfo(9);
    }
}
