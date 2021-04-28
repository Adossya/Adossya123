package udemy.lesson5;

public class lesson5Test1 {

    int summa(int a,int b,int c){
        int result=a+b+c;
        return result;
    }
}
class summa_treh {
    public static void main(String[] args) {
        lesson5Test1 t=new lesson5Test1();
        int summa_tr=t.summa(1,2,3); // t это адрес объекта а т.сумма мы вызываем метод
        System.out.println(summa_tr);
    }
}
