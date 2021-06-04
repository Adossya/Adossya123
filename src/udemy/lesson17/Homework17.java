package udemy.lesson17;

public class Homework17 {
    public static boolean ravenstvo (StringBuilder sb1, StringBuilder sb2){
        boolean sb3;
            if (sb1.toString().equals(sb2.toString())){sb3=true;
                System.out.println("Значения совпадают");}
            else {sb3=false;
                System.out.println("Стринги разные");}
            return sb3;
    }
    public static boolean ravenstvo2 (StringBuilder sb1, StringBuilder sb2){
        return  (sb1.toString().equals(sb2.toString())) ? true: false;
    }

    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Hi Tanya");
        StringBuilder sb2=new StringBuilder("Hi Tanya");
    /*    System.out.println(ravenstvo(sb1,sb2));*/
        ravenstvo(sb1,sb2);
        System.out.println(ravenstvo2(sb1,sb2));
    }
}
