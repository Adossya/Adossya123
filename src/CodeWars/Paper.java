package CodeWars;

public class Paper {
    public static int paperWork(int n, int m)
    {
        if(n>=0 && m>=0 ){return n*m;}else
        {return 0;}
        }


    public static void main(String[] args) {
        System.out.println(paperWork(5,5));
    }
}
