package CodeWars;

public class CatAndShelves {
    public static int solution(int start, int finish){
        int Jumps = 0;
        int i = start;
        while (i <= finish){
            if (i+2 == finish){
                Jumps+=1;
            } else if (i+1 == finish){
                Jumps+=1;
            }
            i=i+3;
            if (i > finish){break;}
            Jumps+=1;
        }
        return Jumps;
    }

    public static void main(String[] args) {
        System.out.println(solution(1,5));
    }
}
