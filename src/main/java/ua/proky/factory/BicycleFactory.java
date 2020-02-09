package ua.proky.factory;

import ua.proky.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component(value = "bicycleFactory")
public abstract class BicycleFactory implements VehicleFactory {

    @Lookup("bicycle")
    abstract public Vehicle createVehicle();
}
