package udemy.lesson22;

public class Animal {
    public Animal(){
        System.out.println("I am animal");
    }
    int eyes;
    public void eat (){
        System.out.println("Animals eats");
    }
    public void drink (){
        System.out.println("Animal drinks");
    }
}
class Pet extends Animal {
    public Pet (){
        System.out.println("I am Pet");
        eyes=2;
    }
    String name;
    public int tail=1;
    public int paw=4;
    public void run (){
        System.out.println("Pet runs");
    }
    public void jump (){
        System.out.println("Pet jumps");
    }
}
class Dog extends Pet{
    public Dog (String name){
        System.out.println("I am dog and my my names is: "+name);
    }
    public void play (){
        System.out.println("Dog plays");
    }
}
class  Cat extends  Pet{
    public Cat (String name){
        System.out.println("I am cat and my name is: "+name);
    }
    public void sleep (){
        System.out.println("Cat sleeps");
    }
}
class  Test {
    public static void main(String[] args) {
        Dog d1=new Dog("Danya");
        System.out.println("The dog has paws: " +d1.paw);
        Cat c1=new Cat("Pusha");
        c1.sleep();
    }
}
