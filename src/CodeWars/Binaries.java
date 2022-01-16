package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binaries {
    public static String coder(String chislo1) {
        String s1="";
        return s1=Integer.toBinaryString(Integer.parseInt(chislo1)+1);
    }

    public static int [] decoder(String sequence) {

        String sequence1=sequence;
        ArrayList <String> list=new ArrayList<>();
        for (int i=0; i<sequence1.length();){
               list.add(sequence1.substring(0, sequence1.indexOf("1") + sequence1.indexOf("1")+1));
               sequence1=sequence1.substring(sequence1.indexOf("1") + sequence1.indexOf("1") + 1);
        }
        int [] n=new int [list.size()];
        for (int i=0;i<list.size();i++){
            n[i]=Integer.parseInt(list.get(i),2)-1;
        }

        return n;
    }
    public static void main(String[] args) {

      String s1="111000000000110010000100000000011001000010000000001100100001111";
      decoder(s1);
      for (int i: decoder(s1)){
          System.out.print(i+" ");
      }
    }
}
