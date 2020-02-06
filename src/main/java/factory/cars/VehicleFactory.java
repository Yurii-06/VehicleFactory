package factory.cars;

import org.springframework.stereotype.Component;

@Component
public interface VehicleFactory {
    Vehicle createVehicle();
}
