package CodeWars;

public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end){
        int [] array=new int[end];
        int q=0;
        for (int i=start;i<=end;i++,q++){
            array[q]=i;
        }
        for (int i:array){
            System.out.print(i+" ");
        }
        return 0;
    }

    public static void main(String[] args) {
        int a,b;
        a=1;
        b=9;
        System.out.println(dontGiveMeFive(a,b));
    }
}
