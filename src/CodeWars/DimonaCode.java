package CodeWars;


import java.util.ArrayList;
import java.util.List;

public class DimonaCode {
    String coder(int a) {

        String result = Integer.toBinaryString(a + 1);
        String temp = "";
        int amountOfBits = result.length();
        for (int i = 0; i < amountOfBits - 1; i++) {
            temp += "0";
        }
        return temp + result;
    }

    public static int[] decoder(String sequence) {
        System.out.println(sequence);
        String sequence1 = sequence;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < sequence1.length();) {
            list.add(sequence1.substring(0, sequence1.indexOf("1") + sequence1.indexOf("1")+1));

            sequence1 = sequence1.substring((sequence1.indexOf("1") + sequence1.indexOf("1") + 1));
            i=0;
            System.out.print(list.get(i) + " ");
            System.out.println(sequence1);
        }

        System.out.println(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = Integer.parseInt(list.get(i), 2) - 1;

            System.out.print(result[i] + " ");
        }

        return result;
    }

    public static void main(String[] args) {
//        CodeDecode codeDecode = new CodeDecode();
//        System.out.println(codeDecode.coder(123));
        decoder("0101010101011010010");
//        System.out.println(CodeDecode.decoder("111111111111000000010000000"));


    }
}
