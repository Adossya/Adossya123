package udemy.lesson7;

public class DrugoyClass {
    public static void main(String[] args) {
        udemy.lesson7.Employee7 object1=new udemy.lesson7.Employee7(1,"Lupalova",228,20040.50,"TS");
        System.out.println("Familiya :"+object1.surname+" Id :"+object1.id+" Vozrast :"+object1.age);
        //Employee7 object2=new Employee7(2000);
        object1.getSuname();
        object1.getID();
        object1.getSalary();
    }

}
