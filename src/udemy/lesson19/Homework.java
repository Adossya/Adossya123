package udemy.lesson19;

public class Homework {
    public static String [] abc (String []... array){
        int length=0;
        for (String []s1:array){
            length+=s1.length;
        }
        String [] target=new String[length];
        int count=0;
        for (String [] s2:array){
        for (String array2:s2){
            target[count]=array2;
            count++;
        }
        }
        return target;
    }

    public static void main(String [] args) {
        String [] target=abc(new String [] {"Abc","Pola","Lolka"},new String[]{"FHJ","dsds","d232131"});
      //  abc(args);

        for (String s1:args){
            System.out.print(s1+" ");

    }
}}
