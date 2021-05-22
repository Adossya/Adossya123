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
        double sum (Home6work2 s1){
            double result = (s1.mathAverage+s1.economyAverage+s1.mathAverage)/3;
            System.out.println("Srednya Arifmeticheskaya studenta "+ s1.name +" "+s1.suname + ": "+result);
                    return result;
            }



    public static void main(String[] args) {
        Home6work2 h1=new Home6work2(1,"Anton","Lupalov",4,5.0,6.0,6.0);

        Home6work2 h2=new Home6work2(2,"Dmitriy","Abramovskiy",3);
        h2.mathAverage = 4.0;
        h2.economyAverage= 3.0;
        h2.englishAverage = 4.0;

        Home6work2 h3=new Home6work2();
        h3.id = 3;
        h3.name = "Karina";
        h3.suname = "Lupalova";
        h3.course = 1;
        h3.mathAverage = 5.0;
        h3.economyAverage = 4.0;
        h3.englishAverage = 5.0;

        StudentTest s10=new StudentTest();
        s10.sum(h1);
        s10.sum(h2);
        s10.sum(h3);



    }
}