package udemy.lesson12;



public class equals1 {
    String name;
    int course;

    equals1(String name) {
        this.name = name;
    }

    public static void sravnenieStudentov(String st1, String st2) {
        if (st1.equals(st2)) {
            System.out.println("Studenti ravni");
        } else {
            System.out.println("Studenti ne ravni");
        }
    }

    public static void main(String[] args) {
        equals1 e1=new equals1("Kuy");
        equals1 e2=new equals1("Kuy");
        sravnenieStudentov(e1.name,e2.name);
        String a="Toha";
        String b="Toha";
        System.out.println(a==b);
    }
}
