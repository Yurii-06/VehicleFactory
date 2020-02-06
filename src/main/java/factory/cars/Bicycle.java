package factory.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Bicycle implements Vehicle {
    String type;

    public Bicycle(String type) {
        this.type = type;
    }

    public void go() {
        System.out.println("spin pedals...");
    }

//    @Override
//    public String toString() {
//        return "Bicycle{" +
//                "type='" + type + '\'' +
//                '}';
//    }
}
