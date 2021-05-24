package udemy.lesson9;

public class Proverkaout {
        int a=1;
        static int b=2;
        void abc (int a){
            System.out.println(b);
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Proverkaout.b);

        }

    public static void main(String[] args) {

            Proverkaout p1=new Proverkaout();
            p1.abc(4);
            //2.4.1.2
    }
}