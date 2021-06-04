package udemy.lesson16;

public class Homework {

    public static void showEmail (String email){
        int a=email.indexOf('@');
        System.out.println(email.substring(a+1,email.indexOf('.')));

    }

   public static void showEmailLine (String s) {


       int a = 0;
       int b = 0;
       int c = 0;
       while (c < s.length() - 1) {

           a = s.indexOf('@', c);
           b = s.indexOf('.', c);
           c = s.indexOf(';', c + 1);
           System.out.println(s.substring(a + 1, b));
       }

   }

    public static void main(String[] args) {
        showEmail("ya@yahoo.com;");
        showEmail("on@mail.ru;");
        showEmail("ona@gmail.com;");
        Homework h1=new Homework();
        h1.showEmailLine("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}
