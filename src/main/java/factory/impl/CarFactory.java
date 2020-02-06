package factory.impl;

import factory.cars.Car;
import factory.cars.Vehicle;
import factory.cars.VehicleFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;

@Component(value = "carFactory")
public class CarFactory implements VehicleFactory {

    public Vehicle createVehicle() {
        return getCar();
    }

    @Lookup
    private Car getCar() {
        return new Car("Mersedes");
    }
}
