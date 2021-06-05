
package CodeWars;

public class TabUmnogeniya {

            public static String multiTable(int num) {
                String result = "";
                for (int i=1; i<=10; i++){
                    if(i<10) { result += Integer.toString(i) + " * " + Integer.toString(num) + " = " + Integer.toString(i*num) + "\n";}
                    else {result += Integer.toString(i) + " * " + Integer.toString(num) + " = " + Integer.toString(i*num);}
                }

                return result;


    }

    public static void main(String[] args) {
        System.out.println(multiTable(10));
    }
}

