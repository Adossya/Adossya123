package HackerRank;

public class StringTokens {

    public static void main(String[] args) {
        String s="He is a very very good boy, isn't he?";
        char [] array=s.toCharArray();
        String [] q=s.split(" ");
        int kol=0;
        for (int i=0;i<array.length;i++){
            if (array[i]==' ' || array[i]==',' || array[i]=='!' || array[i]=='@' || array[i]=='_' || array[i]=='.' || array[i]=='?' || array[i]=='\'' && array[i]!=array[array.length-1]){
                kol+=1;}
            }

        System.out.println(kol-1);
            for (String a:q){
             System.out.println(a);     }


    }


}

