package udemy.Lesson11.Homework;

public class Car {
    public String color;
    public String motor;
    public int kol_dverey;

    Car (String color, String motor, int kol_dverey){
        this.color=color;
        this.motor=motor;
        this.kol_dverey=kol_dverey;
    }
}
class CarTest{
    public static void izmKolDverey (Car car1, int a){
        car1.kol_dverey=a;
    }
    public static void zamenaColora (Car car1, Car car2){
        String car3=car1.color;
        car1.color=car2.color;
        car2.color=car3;
    }
    public static void zamenaMotora (Car car1, Car car2){
        String car3=car1.motor;
        car1.motor=car2.motor;
        car2.motor=car3;
    }

    public static void main(String[] args) {
        Car c1=new Car("Green","V1",4);
        Car c2=new Car("Yellow","V5",2);
        izmKolDverey(c1,3);
        System.out.println(c1.kol_dverey);
        zamenaColora(c1,c2);
        zamenaMotora(c1,c2);
        System.out.println("Цвет машины: "+c1.color+" Мотор машины: "+c1.motor+" Кол. дверей: "+c1.kol_dverey);
        System.out.println("Цвет машины: "+c2.color+" Мотор машины: "+c2.motor+" Кол. дверей: "+c2.kol_dverey);
    }
}
