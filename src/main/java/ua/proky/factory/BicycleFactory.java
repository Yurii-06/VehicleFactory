package ua.proky.factory;

import ua.proky.vehicle.Bicycle;
import ua.proky.vehicle.Vehicle;
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
