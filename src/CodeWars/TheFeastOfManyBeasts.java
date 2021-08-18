package CodeWars;

public class TheFeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        char c1=' ';
        char c2=' ';
        char c3=' ';
        char c4=' ';
        boolean b1=true;
        for (int i=0;i<beast.length();i++){
                c1=beast.charAt(0);
                c2=dish.charAt(0);
                c3=beast.charAt(beast.length()-1);
                c4=dish.charAt(dish.length()-1);
                if (c1==c2 && c3==c4){b1=true;}
                    else {b1=false;}
            }
        return b1;
        }



    public static void main(String[] args) {
        String s1="great blue heron";
        String s2="carlic nann";
        System.out.println(feast(s1,s2));
    }
}
