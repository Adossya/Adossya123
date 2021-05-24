package udemy.lesson9;

public class Homework9 {
    public static void  abc(){
        String s1=new String("ABC");
        String s2=new String("DEF");
    }

    public static void main(String[] args) {
        Homework9 h1=new Homework9();
        abc();
        abc();
        Homework9 h2=new Homework9();
        abc();
        //на этом этапе осталось 2 объекта, так как объекты метода не живи, так как переменные s1 и s2 локальные
    }
}
