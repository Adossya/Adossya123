package udemy.lesson4;


public class Student {
    int studenid;
    String name;
    String suname;
    int course;

    double mathAverage;
    double economyAverage;
    double englishAverage;





}



class StudentTest {

        double sredArifmOcenka (Student st){
            double srednyaOcenka=(st.mathAverage+st.economyAverage+st.englishAverage)/3;
            System.out.println("Средняя оценка студента " + st.name + " " + st.suname + " " + srednyaOcenka);
            return srednyaOcenka;
        }

        public static void main(String[] args) {
        Student object1 = new Student();
        object1.name = "Antona";
        object1.suname = "Lupalova";
        object1.mathAverage = 5;
        object1.economyAverage = 2;
        object1.englishAverage = 3;

        StudentTest Sr1 = new StudentTest();
        Sr1.sredArifmOcenka(object1);


    }
}


