package udemyBlackBeltJava.generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
    Pair<String, Integer> pair1 = new Pair<>("Privet", 20);
        System.out.println("Znacheniya pari: value" +pair1.getFirstValue()+ ", value2 = ");
}
    }

class Pair  <V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue (){
        return value1;
    }
    private V2 getSecondValue (){
        return value2;
    }
}
