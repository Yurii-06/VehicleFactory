package factory.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Car implements Vehicle {
    String type;

    public Car() {}

    public Car(String type) {
        this.type = type;
    }

    public void go() {
        System.out.println("start engine and go");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                '}';
    }
}
