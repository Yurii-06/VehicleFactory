package factory.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Car implements Vehicle {
    private String type;

    public Car() {
        this.type = "unknown";
    }

    public Car(String type) {
        this.type = type;
    }

    public void go() {
        System.out.println("start engine...go!");
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                '}';
    }
}
