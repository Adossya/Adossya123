package udemy.lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1=new String("Zalupa");

        int a = s1.length();
        System.out.println(a);

        char c1= s1.charAt(0);
        System.out.println(c1);

        int i1=s1.indexOf('p');
        System.out.println(i1);

        int i2=s1.indexOf("p");
        System.out.println(i2);

        int i3=s1.indexOf("k");
        System.out.println(i3); //если не найден чар, то ответ будет -1

        int i4=s1.indexOf("a",5);
        System.out.println(i4);

        boolean b1=s1.startsWith("abc");
        System.out.println(b1);
        boolean b2=s1.startsWith("Za");
        System.out.println(b2);

        boolean b3=s1.startsWith("up",3);
        System.out.println(b3);

        boolean b4=s1.endsWith("upa");
        System.out.println(b4);


    }
}
