package udemyBlackBeltJava.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Supppplier {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> ar1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ar1.add((carSupplier.get()));
        }
        return ar1;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> {
            return new Car("Nissan Tiida", "Blue", 1.6);
        });
        System.out.println(("Our Cars:" + ourCars));
        changeCar(ourCars.get(0), (car) -> {
            car.model = "Cherry Tiggo";
            car.color = "red";
            car.engine = 2.4;
            System.out.println("upgradd car: " + car);
        });
        System.out.println(ourCars);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}

