package factory.cars;

public class Car implements Vehicle {
    String type;

    public Car(String type) {
        this.type = type;
    }

    public void go() {
        System.out.println("start engine and go");
    }
}
