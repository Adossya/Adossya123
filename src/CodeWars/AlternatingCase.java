package CodeWars;

public class AlternatingCase {
    public static String toAlternativeString(String string) {
        String s2="";
        String s3=string.toUpperCase();
        char c1=' ';
        char c2=' ';
        for (int i=0; i<string.length();i++){

            c1=string.charAt(i);
            c2=s3.charAt(i);
                System.out.println(c1+" ");
                System.out.println(c2);

            if(c1==c2){
                c1=Character.toLowerCase(c1);
                } else {
                    c1=Character.toUpperCase(c1);
                    }

            s2+=String.valueOf(c1);
        }
        return s2;
    }

    public static void main(String[] args) {
        String s1="[HELLO WORL]d";
        System.out.println(toAlternativeString(s1));
    }
}
