package CodeWars;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String result="";
        char [] array=numberString.toCharArray();
        for (int i=0; i<numberString.length(); i++){
            if (Character.getNumericValue(array[i])<5){
                result+="0";
            } else {result+="1";}
        }
                return result;
    }
    public static void main(String[] args) {
        String s1="45385593107843568";
        System.out.println(fakeBin(s1));
    }
}
//public class FakeBinary {
//    public static String fakeBin(String numberString) {
//        String res = "";
//        for (int i = 0; i < numberString.length(); i++) {
//            if (numberString.charAt(i) < '5') {
//                res += '0';
//            } else {
//                res += '1';
//            }
//        }
//        return res;
//    }
//}


// return new String(c); прикольно придумано

//public class FakeBinary {
//    public static String fakeBin(String numberString) {
//        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
//    }
//}