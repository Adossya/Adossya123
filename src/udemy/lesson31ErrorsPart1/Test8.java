package udemy.lesson31ErrorsPart1;

import java.io.*;

public class Test8 {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Privet");
        try {
            File f = new File("text9.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman");
            System.out.println("peremennaya a v catch bloke =" + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("peremennaya a v finally bloke " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}

