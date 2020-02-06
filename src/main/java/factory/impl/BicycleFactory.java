package factory.impl;

import factory.cars.Bicycle;
import factory.cars.Vehicle;
import factory.cars.VehicleFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component(value = "bicycleFactory")
public class BicycleFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return getBicycle();
    }

    @Lookup
    public Bicycle getBicycle() {
        return null;
    }
}
