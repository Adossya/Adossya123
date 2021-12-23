package udemyBlackBeltJava.nested_classes.static_nested_class.anonimus_class;

public class anonimous_class {
    public static void main(String[] args) {
        Math2 m=new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };
        Math2 m2=new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
        System.out.println(m.doOperation(3,6));
        System.out.println(m2.doOperation(3,6 ));

    }
}
interface Math2{
    int doOperation (int a, int b);
}