package udemy.lesson4ClassObject;

public class lesson4test1 {
    // затупил с названием
    int id;
    String name;
    double balance;


}

class BankAccount {
    public static void main(String[] args) {
        lesson4test1 MyAccount = new lesson4test1();
        lesson4test1 YouAccount = new lesson4test1();
        lesson4test1 HisAccount = new lesson4test1();

        MyAccount.id=1;
        MyAccount.name="Anton";
        MyAccount.balance=12.35;

        YouAccount.id=2;
        YouAccount.name="Mike";
        YouAccount.balance=15.00;

        HisAccount.id=3;
        HisAccount.name="Ivan";
        HisAccount.balance=124.25;

        System.out.println(MyAccount.name);
        System.out.println(YouAccount.balance);
        System.out.println(HisAccount.id);
    }
}
