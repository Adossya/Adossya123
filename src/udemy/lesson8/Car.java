package udemy.lesson8;

public class Car {
    String color="blue";
    String engine="v6";

}
class Human{
    String name="Ivan";
    Car c=new Car();

    public static void main(String[] args) {
        Human h1=new Human();
        h1.c=new Car();
        h1.c=new Car();
        h1.c.engine="v8";
        System.out.println(h1.c.color);
    }
}
