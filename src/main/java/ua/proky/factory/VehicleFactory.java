package ua.proky.factory;

import ua.proky.vehicle.Vehicle;
import org.springframework.stereotype.Component;

@Component
public interface VehicleFactory {
    Vehicle createVehicle();
}
