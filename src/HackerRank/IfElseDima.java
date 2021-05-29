package HackerRank;

public class IfElseDima {
    public static void task_if(int i) {
        if((i%2==1) || (i%2==0 && i>=6 && i<=20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not weird");
        }
    }
    public static void main(String[] args) {

        task_if(3);
    }

}
