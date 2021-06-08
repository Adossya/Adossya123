package CodeWars;

public class AbbreviateTwoWords1 {

    public static String abbrevName(String name) {
        String s1=new String(name);
        String s2=s1.toUpperCase();

        String s3="";


       char a;
       char b;
        for (int i=1; i<=s1.length()-1 ; i++){
            a=s1.charAt(i);
            b=s2.charAt(i);

            if (a==b && a!='!' && a!=' ' && a!='.' ){



                s3=s3.concat(String.valueOf(a));
                break;
            }
        }

        return s2.substring(0,1)+"."+s3;
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam AMZNC"));
    }
}
