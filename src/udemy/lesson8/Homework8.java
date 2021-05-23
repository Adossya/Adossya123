package udemy.lesson8;

public class Homework8 {

    public static int umnogenie (int a, int b, int c){
            int result=a*b*c;
            System.out.println("Resultat umnogenie trioh chisel :"+result);
            return result;
    }
    public static void delenie (int a, int b){
            int c=a/b;
            System.out.println("Delenie dvuh chisel: "+c+" i ostatok ot deleniya: "+a%b);
    }
}
class Homework8_2 {
    public static void main(String[] args) {
        Homework8.umnogenie(2,3,4);
        Homework8.delenie(6,4);
        Homework8 h1=new Homework8();
        h1.umnogenie(1,5,4);
        Homework8 h2=new Homework8();
        h2.delenie(23,3);
    }

}