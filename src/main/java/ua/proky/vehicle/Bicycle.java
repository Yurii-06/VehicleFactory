package ua.proky.vehicle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Bicycle implements Vehicle {
    private String type = "unknown";

    public Bicycle() {}

    public Bicycle(String type) {
        this.type = type;
    }

    public void go() {
        System.out.println("spin bicycle pedals...go!");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "type='" + type + '\'' +
                '}';
    }
}
