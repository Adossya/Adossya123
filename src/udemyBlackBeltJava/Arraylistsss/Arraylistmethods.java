package udemyBlackBeltJava.Arraylistsss;

import java.util.ArrayList;
import java.util.Objects;

public class Arraylistmethods {
    public static void main(String[] args) {
        Studentsss st1=new Studentsss("Toha",'m',22,4,7.2);
        Studentsss st2=new Studentsss("Andrey",'m',27,3,1.2);
        Studentsss st3=new Studentsss("Dima",'m',20,2,8.2);
        Studentsss st4=new Studentsss("Vova",'m',19,1,4.2);
        ArrayList<Studentsss> arlist1=new ArrayList<>();
        arlist1.add(st1);
        arlist1.add(st2);
        arlist1.add(st3);
        arlist1.add(st4);
        System.out.println(arlist1);
        Studentsss st5=new Studentsss("Vova",'m',19,1,4.2);
        System.out.println(arlist1);
        arlist1.remove(st5);
        System.out.println(arlist1);


    }
}

class Studentsss{
    private String name;
    private char male;
    private int age;
    private int course;
    private double avgGrade;

    public Studentsss(String name, char male, int age, int course, double avgGrade) {
        this.name = name;
        this.male = male;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Arraylistmethods{" +
                "name='" + name + '\'' +
                ", male=" + male +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studentsss that = (Studentsss) o;
        return male == that.male && age == that.age && course == that.course && Double.compare(that.avgGrade, avgGrade) == 0 && Objects.equals(name, that.name);
    }


}
