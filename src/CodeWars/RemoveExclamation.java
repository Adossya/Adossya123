package CodeWars;

public class RemoveExclamation {

    static String removeExclamationMarks(String s) {
        String s1=s.replace("!","");//как же долго я епался
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello World[!!!]"));
    }
}
