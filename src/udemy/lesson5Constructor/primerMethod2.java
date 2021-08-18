package udemy.lesson5Constructor;

public class primerMethod2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost){
        speed+=skorost;
        return speed;
    }
    int tormoz (int skorost){
        speed-=skorost;
        return speed;
    }

    void showinfo(){

        System.out.println("Цвет "+color+" Мотор "+ engine + " Скорость "+speed);
    }
}
class Car2test {
    public static void main(String[] args) {
        primerMethod2 c1=new primerMethod2();
        c1.color="White";
        c1.engine="V6";
        c1.speed=60;

        c1.showinfo();
        c1.gaz(20);
        c1.showinfo();
        c1.tormoz(80);
        c1.showinfo();

    }
}