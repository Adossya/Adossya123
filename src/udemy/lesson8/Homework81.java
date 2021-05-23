package udemy.lesson8;

public class Homework81 {
    public static final double Pi=3.14;

    public double Ploshad (double radius){
        double S=Pi*radius*radius;
        /*System.out.println("Ploshad ravna: "+S);*/
        return S;
        }

    static double Dlinna_okrugnosti (double radius2){
        double dlinna=2*Pi*radius2;
        /*System.out.println("Dlinna okrugnosti ravna: "+dlinna);*/
        return dlinna;
        }

    void showInfo (double radius3){
        System.out.println("Radius: "+radius3);
        System.out.println("Kruga ploshad ravna: "+Ploshad(radius3));
        System.out.println("Dlinna okrugnosti: "+Dlinna_okrugnosti(radius3));
    }
}
class Homework82 {
    public static void main(String[] args) {
        Homework81 h1=new Homework81();
        h1.Ploshad(5);
        Homework81.Dlinna_okrugnosti(3);
        h1.showInfo(4);
    }
}
