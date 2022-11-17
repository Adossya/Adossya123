package udemyBlackBeltJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {


        String s
                = "Ivanov Vasiliy, Poland, Warshawa, Polka street, 51, Flat 48" +
                "email: ivanov@gmail.com, Postcode: AA99, Phone Number: +123456"
                + "Lupalov Antjn, Ukraine, Krivoy Rog, Sergeya Kolachevskogo street, 48, Flat 30" +
                "email: adossya@rambler.com, Postcode: 50086, Phone Number: +9379992" +
                "Kolya Polya, Poland, Krakov, Polka street, 11, Flat 108" +
                "email: TanyaPES@ia.com, Postcode: 123599, Phone Number: +346713213";
//        Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern1 = Pattern.compile("\\+\\d{9}");
//        Pattern pattern1 = Pattern.compile("\\w+@\\w+\\.\\w+"); изи
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");  // s - пробельный символ, соответствует \t таб \n начало новой строки \f символ означающий конец страницы \r новая строчка
        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");
        Matcher matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());

        }

    }
}
