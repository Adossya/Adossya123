package HackerRank;

public class UphillDownstep {
    public static int countingValleys(int steps, String path) {
        var schet=0;
        var vallays=0;
        char [] array=path.toCharArray();

        for (var i=0;i<array.length;i++){
            if (array[i]=='U'){schet+=1;};
            if (array[i]=='D'){schet-=1;};
            if (schet==0 && array[i]=='U'){vallays+=1;}
        }

        return vallays;

    }

    public static void main(String[] args) {
        int a=12;
        String stepss="DDUUDDUDUUUD";
        System.out.println(countingValleys(a,stepss));
    }
}
