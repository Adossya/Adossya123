package udemy.lesson7;


public class Employee7 {

    public Employee7(int nomer, String familiya, int vozrast, double zp, String dolgnost) {
        id = nomer;
        surname = familiya;
        age = vozrast;
        salary = zp;
        department = dolgnost;
    }


    public Employee7(int id2, String surname2) {
        this(id2, surname2, 0, 0.0, null);
    }

    public Employee7(double salary2) {
        salary = salary2;

    }

    public void getID() {
        System.out.println("ID= " + id);
    }

    public void getSuname() {
        System.out.println("Suname :" + surname);
    }

    public void getSalary() {
        System.out.println("Salary= " + salary);
    }


        int id;
        public String surname;
        int age;
        private double salary;
        String department;
        public double uvelish (){
            salary*=2;
            System.out.println("Zp :"+ salary+ " Imya :" +surname);
            return salary ;
        }

    }
    class  EmployeeTes{


        public static void main(String[] args) {
            Employee7 object1=new Employee7(1,"Lupalov",28,2000.50,"VTS");
            Employee7 object2=new Employee7(2,"Abramovskiy",29,11000.10,"Bankir");
            Employee7 object3=new Employee7(1,"Lupalova");
            object3.age=5;
            object3.department="Sadik";
            Employee7 object4=new Employee7(2021);
            object4.surname="Tanya";

            object1.getSalary();
            object1.getID();
            object1.getSuname();
            object1.uvelish();

            object2.getSalary();
            object2.getID();
            object2.getSuname();
            object2.uvelish();

            object3.getSalary();
            object3.getID();
            object3.getSuname();
            object3.uvelish();

            object4.getSalary();
            object4.getID();
            object4.getSuname();
            object4.uvelish();

        }
    }

