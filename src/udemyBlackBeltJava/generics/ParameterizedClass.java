package udemyBlackBeltJava.generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info <String> info1=new Info<>("privet");
//        System.out.println(info1);
//        String s =info1.getValue();
//        System.out.println(s);
        Info <Integer> info2=new Info<>(18);
        System.out.println(info2);

        Info <Double> info123=new Info<>(2.33);
        System.out.println(info123);
        Double d=info123.getValue();
//        Info <Bus> info3=new Info<>(new Bus());
//        System.out.println(info3);
//        Bus b1=info3.getValue();
    }
}

class Info <T extends Number> {
    private T value;
    public Info (T value){
        this.value=value;
    }
    @Override
    public String toString() {
        return "{{" + value + "}}";
    }
    public  T getValue (){
        return value;
    }
}

class  Bus{

}
