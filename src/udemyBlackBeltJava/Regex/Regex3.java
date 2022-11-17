package udemyBlackBeltJava.Regex;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Poland, Warshawa, Polka street, 51, Flat 48" +
                "email: ivanov@gmail.com, Postcode: AA99, Phone Number: +123456"
                + "Lupalov Anton, Ukraine, Krivoy Rog, Sergeya Kolachevskogo street, 48, Flat 30" +
                "email: adossya@rambler.com, Postcode: 50086, Phone Number: +9379992" +
                "Kolya Polya, Poland, Krakov, Polka street, 11, Flat 108" +
                "email: TanyaPES@ia.com, Postcode: 123599, Phone Number: +346713213";
        String s2 = "TanyaPES@ia.com";
        boolean result = s2.matches("\\w+@\\w+\\.\\w+"); //сравнивает текущую строку с рег. выражением
        System.out.println(result);
        String [] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
