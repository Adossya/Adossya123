package udemy.lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1=new String("Zagksdkasdkalupa");
        String s2=new String("Lupalov");


        String s10=s1.substring(3);
        System.out.println(s10);

        String s11=s1.substring(3,7);
        System.out.println(s11);


        String s12 =s11.trim(); //убирает пробелы по бокам
        System.out.println(s12);

        String s14=s2.replace('L','S');
        System.out.println(s14);

        String s15=s2.replace("Lupalov","Abramovskiy");
        System.out.println(s15);

        String s16="Britva";
        String s3=s16.replace('t','t');
        System.out.println(s16==s3);



        String a1="zdar";
        String a2="ova";
        System.out.println(a1.concat(a2));

    }
}
