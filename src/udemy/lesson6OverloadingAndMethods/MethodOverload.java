package udemy.lesson6OverloadingAndMethods;

public class MethodOverload {
    void show (int i1){
        System.out.println(i1);
        System.out.println("");
    }
    void show (boolean b1){
        System.out.println(b1);
    }
    void show (String s1){
        System.out.println(s1);
    }
    void show (String s, int a){
        System.out.println("String :"+s+" int :"+a);
    }
    void show (int a, String s){
        System.out.println("Kakoy xoroshiy den!!!");
    }
}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverload mo = new MethodOverload();
        int a=500;
        mo.show(a);
        boolean b = true;
        mo.show(b);
        String a1 = "Privet";
        mo.show(a1);
        mo.show("String",10);
        mo.show(10,"kuy");
    }
}