package udemy.lesson5;

import udemy.lesson4.lesson4test1;

public class BankAccountHomework {
    int id;
    String name;
    double balance;

    double polnenieScheta (double popolnenie){
        balance+=popolnenie;
        return balance;
}
    double snyatieSoScheta (double snyatie){
        balance-=snyatie;
        return balance;
    }
    void infocheta (){
        System.out.println("Номер студента "+ id + " имя студента "+ name + " измененный баланс "+balance);
    }
}
class BankAccount {
    public static void main(String[] args) {
       BankAccountHomework MyAccount = new BankAccountHomework();
       BankAccountHomework YouAccount = new BankAccountHomework();
       BankAccountHomework HisAccount = new BankAccountHomework();

        MyAccount.id=1;
        MyAccount.name="Anton";
        MyAccount.balance=12.35;
        System.out.println("Номер студента " + MyAccount.id + " имя " + MyAccount.name + " баланс " + MyAccount.balance);


        MyAccount.polnenieScheta(20.15);
        MyAccount.infocheta();
        MyAccount.snyatieSoScheta(32.00);
        MyAccount.infocheta();

    }
}