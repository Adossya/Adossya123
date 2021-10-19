package CodeWars;

public class Vowels {

        public static int getCount(String str) {
            int vowelsCount = 0;
            char[] chArray = str.toCharArray();
            for (int i=0; i<chArray.length;i++){
                if (chArray[i]=='a'  || chArray[i]=='e'  || chArray[i]=='i'  || chArray[i]=='o'  || chArray[i]=='u'){
                    vowelsCount+=1;
                }
            }
            return vowelsCount;
        }

    public static void main(String[] args) {
        System.out.println(getCount("pear tree"));
    }
}


//a, e, i, o, u

