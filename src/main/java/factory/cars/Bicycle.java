package factory.cars;

public class Bicycle implements Vehicle {
    String type;

    public Bicycle(String type) {
        this.type = type;
    }

    public void go() {
        System.out.println("spin pedals...");
    }
}
