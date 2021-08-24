package udemy.lesson31ErrorsPart1;
import java.io.*;

public class Test5 {
    public static void main(String[] args) {
        try {
            File f=new File("test8.txt");
            FileInputStream fis=new FileInputStream (f);
        }
        catch (NullPointerException e){
            System.out.println("Exp 1");
        }
        catch (FileNotFoundException e){
            System.out.println("Exp 2");
        }
        catch (IOException e){
            System.out.println("Exp 3");
        }
        catch (RuntimeException e){
            System.out.println("Exp 4");
        }
        catch (Exception e){
            System.out.println("Exp 5");
        }
        catch (Throwable e){
            System.out.println("Exp 6");
        }

    }
}
