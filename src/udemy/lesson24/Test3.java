package udemy.lesson24;

public class Test3 {

    public static void main(String[] args) {
        Figura f1=new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }
}

abstract class Figura{
    int kolichestvoStoron=0;
    abstract void perimetr ();
    abstract void ploshad ();
    void showInfp(){
        System.out.println("Eto figura");
    }
}
class  Kvadrat extends Figura{
    int kolichestvoStoron=4;
    int storona1=10;
    public void perimetr(){
        System.out.println("Perimetr kvadrata ="+4*storona1);
    }
    public void ploshad (){
        System.out.println("Ploshad kvadrate ="+storona1*storona1);
    }
}
class  Prymougolnik extends Figura{
    int kolichestvoStoron=4;
    int storona1=8;
    int storona2=5;

    public void perimetr(){
        System.out.println("Perimetr pryamougolnika ="+2*(storona1+storona2));
    }
    public void ploshad (){
        System.out.println("Ploshad pryamougolnika ="+storona1*storona1);
    }
}

class  Okrugnost extends Figura{
    int kolichestvoStoron=0;
    int radius =3;


    public void perimetr(){
        System.out.println("Perimetr pryamougolnika ="+2*3.14*radius);
    }
    public void ploshad (){
        System.out.println("Ploshad pryamougolnika ="+3.14*radius*radius);
    }
}
abstract class Chetirexugolnik extends Figura{
    void def (){
        System.out.println("eto chetirexugolnik");
    }
}