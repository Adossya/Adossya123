package udemy.lesson12;

import udemy.Lesson11.Student;



public class StudentTest {

    public static void sravnenieStudentov (String name1, String name2){
        if (name1.equals(name2)){
            System.out.println("Студентов зовут одинаково "+name1);
        }else  {
            System.out.println("Cтудентов зовут по разному "+name1+" и "+name2);
        }
    }
    public static void sravnenieVsego (String name1, int course1, double grade1, String name2, int course2, double grade2){

        if (name1.equals(name2)){
            /*System.out.println("Студентов зовут одинаково "+name1);*/

                if(course1>=course2) {
            /*System.out.println("Student 1 uchitsya na starshem kurse ili na tom ge");*/

                        if (grade1>=grade2) {
            /*System.out.println("U Student 1 ocenki lushe");*/}
                         else  {
            System.out.println("U Student 2 ocenki lushe");
        }}
                 else {
                System.out.println("Student 2 uchitsya na starshem kurse");
            }
        }
         else {
            System.out.println("Cтудентов зовут по разному "+name1+" и "+name2);
        }



        }


    public static void main(String[] args) {
        Student st1=new Student("Antoha",4,4.0);
        Student st2=new Student("Antoha",3,5.2);
        sravnenieStudentov(st1.name,st2.name);
        /*System.out.println(st1.name);
        System.out.println(st2.name);
        System.out.println(st1.course);
        System.out.println(st2.course);
        System.out.println(st1.grade);
        System.out.println(st2.grade);*/

        sravnenieVsego(st1.name,st1.course,st1.grade,st2.name,st2.course,st2.grade);

    }
}
