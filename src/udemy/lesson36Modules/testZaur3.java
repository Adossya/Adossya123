package udemy.lesson36Modules;

import udemy.p1.p2.p3.C;

interface Jumpable{}
class Cats implements Jumpable {}
class Tiger extends Cats {}
class House {}

public class testZaur3 {
    public static void main(String[] args) {
        Jumpable j=new Tiger();
        Tiger t=new Tiger();
        House h=new House();

        if(j instanceof Jumpable){
            System.out.println("kuy");
        }
        if (t instanceof Cats){
            System.out.println("s");
        }
       // if (h instanceof Cats){
        //    System.out.println("sds");
        //}
    }
}
