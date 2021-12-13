package HackerRank;

public class StringReverse {


    public static String Reverse (String A){
        StringBuffer sb=new StringBuffer (A);
        StringBuffer sb1=new StringBuffer(A);

        return sb.reverse().toString().equals(sb1.toString())?"Yes":"No";




    }

    public static void main(String[] args) {
        String A="java";
        System.out.println(Reverse(A));
    }
}
