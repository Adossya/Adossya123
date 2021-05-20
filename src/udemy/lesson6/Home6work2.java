package udemy.lesson6;

public class Home6work2 {
    Home6work2 (int id2, String name2, String suname2, int course2, double mathAverage2, double economyAverage2, double englishAverage2){
        id=id2;
        name=name2;
        suname=suname2;
        course=course2;
        mathAverage=mathAverage2;
        economyAverage=economyAverage2;
        englishAverage=economyAverage2;

    }
    Home6work2 (int id3, String name3, String suname3, int course3){
        this (id3,name3,suname3,course3,0.0,0.0,0.0);
    }
    Home6work2 (){
        this (0,null,null,0,0.0,0.0,0.0);
    }
    int id;
    String name;
    String suname;
    int course;
    double mathAverage;
    double economyAverage;
    double englishAverage;


}
class StudentTest {
    public static void main(String[] args) {
        Home6work2 h1=new Home6work2(1,"Anton","Lupalov",4,5.0,6.0,6.0);
        Home6work2 h2=new Home6work2(3,"Dmitriy","Abramovskiy",3);
        Home6work2 h3=new Home6work2();
        System.out.println(h1.id);
        System.out.println(h2.name);
        System.out.println(h3.name);


    }
}