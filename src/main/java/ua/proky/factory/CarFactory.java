package ua.proky.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import ua.proky.vehicle.Car;
import ua.proky.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component(value = "carFactory")
public abstract class CarFactory implements VehicleFactory {

     @Lookup("car")
     public abstract Vehicle createVehicle();
}
