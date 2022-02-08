package CodeWars;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        String middle="";
       if (word.length()%2==0){
           middle=word.substring(word.length()/2-1,word.length()/2+1);
       } else {middle=word.substring(word.length()/2,word.length()/2+1);};
       return middle;
    }

    public static void main(String[] args) {
            String s1="testing";
        System.out.println(getMiddle(s1));
    }
}
