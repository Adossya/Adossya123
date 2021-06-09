package udemy.lesson18;

public class Test7 {
    public static void main(String[] args) {
        char [] array1={'a','5','c','a','a','a',};
                String s=new String(array1);
        System.out.println(s);
        StringBuilder sb1=new StringBuilder("hello wordl");
        sb1.append(array1,2,3);
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("Zdarova");
        sb2.insert(1,array1,1,3);
        System.out.println(sb2);
    }
}
