package udemy.lesson16;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s1="Hello World";
        String s2="Urraaaaa!!!";
        String s3=s1.concat(s2).toLowerCase().replace("Urraaaaa!!!","Ура").substring(6,10);
        System.out.println(s1.substring(s1.indexOf('W')));

    }

}
