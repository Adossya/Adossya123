package udemyBlackBeltJava.nested_classes.static_nested_class.Inner_Class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        int horsePower;
        

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {

        Car car=new Car("red",2);
        Car.Engine engine=car.new Engine(150);
        System.out.println(car);
        System.out.println(engine);
        car.setEngine(engine);
        Car.Engine engine1=new Car("yellow",4).new Engine(200);
        System.out.println(engine1);
    }
}

