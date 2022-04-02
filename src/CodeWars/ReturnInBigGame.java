
package CodeWars;

public class ReturnInBigGame {
    public static int Old (final String heOlr){
        char [] array=heOlr.toCharArray();
        int i=0;
        i=array[0]-'0';
        return i;
    }

    public static void main(String[] args) {

        String howOld="5 years old";
        System.out.println(Old(howOld));
    }
}
