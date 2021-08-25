package udemy.lesson31ErrorsPart1;

import java.io.*;

public class Test9 {
    void abc () throws FileNotFoundException{
        try {
            File f = new File("text10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("eto block finally");
        }
    }
    void method  () {
        try {
        abc();}
        catch (FileNotFoundException e){
            System.out.println("Polnost'u obrabotan");
        }
    }

//    void def () {
//        try {
//            int [] array={1,2,3};
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception poyman i nemnogo obrabotan");
//            throw e;
//        } finally {
//            System.out.println("eto block finally");
//        }
//    }
}
