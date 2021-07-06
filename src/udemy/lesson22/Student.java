package udemy.lesson22;

public class Student {
    private StringBuilder name=new StringBuilder();
    public StringBuilder setName (String imya){
        if (imya.length()>3){
            this.name=new StringBuilder(imya);
            return name;
        } else {
            System.out.println("Длинна имени должна быть больше 3 символов");
                    return null;
                }
    }
    private int course;
    public int setCourse (int a){
        if (a>0 && a<=10){
            this.course=a;
            return course;
            } else {
            System.out.println("Диапозон чисел должен быть от 1 до 10");
            return 0;
                    }
    }

    private int grade;
    public int setGrade (int b){
        if (b>0 && b<=4){
            this.grade=b;

        }
        return grade;
    }
    public void getInfo (){
        System.out.println(name);
    }
    public void getCourse(){
        System.out.println(course);
    }
    public void getGrade (){
        System.out.println(grade);
    }
    public void showInfo (){
        getInfo();
        getCourse();
        getGrade();
    }
}
class TestStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Anton");
        s1.setCourse(3);
        s1.setGrade(4);
        s1.showInfo();
    }
}



