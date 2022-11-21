package udemyBlackBeltJava.Stream;

import java.util.ArrayList;
import java.util.List;

public class flatMap {
    public static void main(String[] args) {
        Student st1=new Student("Ivan",'m',22,3,8.3);
        Student st2=new Student("Nikolay",'m',28,2,6.4);
        Student st3=new Student("Elena",'f',19,1,8.9);
        Student st4=new Student("Petr",'m',35,4,7);
        Student st5=new Student("Mariya",'f',23,3,7.4);

        Faculty f1 = new Faculty("Economic");
        Faculty f2 = new Faculty("Applied mathematic");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);


        List <Faculty> facultiList = new ArrayList<>();
        facultiList.add(f1);
        facultiList.add(f2);

        facultiList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(e -> System.out.println(e.getName()));
    }
}

class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name){
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }
    public void addStudentToFaculty (Student st){
        studentsOnFaculty.add(st);
    }
}