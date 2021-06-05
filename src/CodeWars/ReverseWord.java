package CodeWars;

public class ReverseWord {

        public static String reverseWords(String str){
            StringBuilder s1=new StringBuilder(str);
            s1.reverse();
            String s2=s1.toString();

            return s2;
            //write your code here...
        }

    public static void main(String[] args) {
        System.out.println(reverseWords("9na"));
    }
    }

