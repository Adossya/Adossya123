package CodeWars;

public class booleanB {

        public static String convert(boolean b){
            if(b==true) {
                return "true";
            } else if (b==false){
                return "false";
            }
            return "what";
        }

    public static void main(String[] args) {
        System.out.println( convert(true));
    }
}
