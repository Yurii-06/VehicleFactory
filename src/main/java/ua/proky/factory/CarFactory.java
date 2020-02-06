package ua.proky.factory;

import ua.proky.vehicle.Car;
import ua.proky.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component(value = "carFactory")
public class CarFactory implements VehicleFactory {

    public Vehicle createVehicle() {
        return getCar();
    }

    @Lookup
    public Car getCar() {
        return null;
    }
}
