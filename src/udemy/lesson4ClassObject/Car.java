package udemy.lesson4ClassObject;

public class Car {
    String color = "red";
    String engine = "V6";
}
class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1;

        System.out.println("Cvet " + car1.color);
        System.out.println("Motor "+ car2.engine);
    }
}