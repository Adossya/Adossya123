package udemyBlackBeltJava.lambda;

public class student2 {
    String name;
    char sex;
    int age;
    int course;
    double avr_Grade;

    public student2 (String name, char sex, int age, int course, double avr_Grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avr_Grade = avr_Grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avr_Grade=" + avr_Grade +
                '}';
    }
}
