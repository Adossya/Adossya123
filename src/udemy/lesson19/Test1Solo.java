package udemy.lesson19;

public class Test1Solo {
    public static void main(String[] args) {
        String [] students = {"Ivanov","Petrob","Sidorov"};
        String [] examen = {"Matematica","Fizika"};
        for (String s:students){
            for (String s1:examen){
                System.out.println("Student "+s+" zdaet examen "+s1);
            }


        }
    }
}
