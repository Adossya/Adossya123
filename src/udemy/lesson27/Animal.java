package udemy.lesson27;



class Lesson24{
    public static void main(String[] args) {
        Mechenosec m1=new Mechenosec("RibaMe4");
        System.out.println(m1.name);
        m1.swim();
        m1.eat();
        m1.sleep();
        Speakeble s1=new Pingvin("Vasya");
        s1.speak();
        Animal a1=new Lev("Leva");
        System.out.println(a1.name);
        a1.eat();
        a1.sleep();
        Mammal m2=new Lev("Lev");
        System.out.println(m2.name);
        m2.eat();
        m2.sleep();
        m2.run();

    }
}
abstract public class Animal {


    Animal (String name){
        this.name=name;
    }
    String name;
    abstract public void eat();
    abstract public void sleep();
}
abstract class Fish extends Animal{

    Fish (String name){
        super(name);
        this.name=name;
    }
    String name;
    public void sleep (){
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }
    abstract public void swim ();
}
abstract class Bird extends Animal implements Speakeble{
    String name;
    Bird (String name){
        super(name);
        this.name=name;
    }
    public void speak(){
        System.out.println(name+" sings");
    }
    abstract public void fly ();
}
abstract class Mammal extends Animal implements Speakeble{
    String name;
    Mammal (String name){
        super(name);
        this.name=name;
    }
    abstract public void run ();
}
interface Speakeble {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
class Mechenosec extends Fish {
    String name;
    Mechenosec (String name){
        super(name);
        this.name=name;
    }
    public void swim (){
        System.out.println("Meshenosec krasivaya riba, kotoraya bistro plavaet");
    }
    public void eat(){
        System.out.println("Meshenosec ne xishnaya riba, i ona est obichnuy ribiy korm");
    }
}
class Pingvin extends Bird{
    String name;
    Pingvin (String name){
        super(name);
        this.name=name;
    }
    public void eat(){
        System.out.println("Pingvin lubit est ribu");
    }
    public void sleep(){
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }
    public void fly(){
        System.out.println("Pingvini ne umet letat!");
    }
    public void speak(){
        System.out.println("Pingvin ne umeet pet' kak solovey.");
    }
}
class Lev extends Mammal{
    String name;
    Lev (String name){
        super(name);
        this.name=name;
    }
    public void eat(){
        System.out.println("Lev, kak luboy xishnik lubit m9so!");
    }
    public void sleep(){
        System.out.println("Bolshuy chast' dn9 lev spit");
    }
    public void run(){
        System.out.println("Lev-eto ne samaya bistraya koshka");
    }
}

