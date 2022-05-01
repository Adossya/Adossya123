package CodeWars;

public class CardMask {

        public static String maskify(String str) {
            String maskify="";
            char [] array=str.toCharArray();
            if (str.length()>4){
                for (int i=0; i< array.length-4;i++){
                    maskify+='#';
                }
                return maskify+str.substring(array.length-4, array.length);
            }
            maskify=str;
            return maskify;
        }

    public static void main(String[] args) {
        String card="4556364607935616";
        String card2="64607935616";
        String card3="1";
        String card4="";

        System.out.println(maskify(card));
        }

}
